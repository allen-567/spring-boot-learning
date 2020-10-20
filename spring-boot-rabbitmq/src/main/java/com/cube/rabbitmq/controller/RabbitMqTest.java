package com.cube.rabbitmq.controller;

import com.rabbitmq.client.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Author:   滕飞
 * Date:    2019/9/19 3:40 PM
 * Description:
 */
public class RabbitMqTest {

    //消息队列名称
    private final static String QUEUE_NAME = "bi-city-probe";

    @Test
    public void send() throws java.io.IOException, TimeoutException {

        //创建连接工程
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("172.16.31.5");
        factory.setPort(5672);
        factory.setUsername("rabbitmq");
        factory.setPassword("1q2w3e4r");
        factory.setVirtualHost("danke");
        //创建连接
        Connection connection = factory.newConnection();

        //创建消息通道
        Channel channel = connection.createChannel();

        //生成一个消息队列
        channel.queueDeclare(QUEUE_NAME, true, false, false, null);


        for (int i = 0; i < 10; i++) {
            String message = "Hello World RabbitMQ count: " + i;

            //发布消息，第一个参数表示路由（Exchange名称），未""则表示使用默认消息路由
            channel.basicPublish("", QUEUE_NAME, null, message.getBytes());

            System.out.println(" [x] Sent '" + message + "'");
        }


        //关闭消息通道和连接
        channel.close();
        connection.close();

    }


    @Test
    public void consumer() throws java.io.IOException, java.lang.InterruptedException, TimeoutException {

        //创建连接工厂
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("127.0.0.1");
        factory.setPort(5672);
        factory.setUsername("admin");
        factory.setPassword("admin");

        //创建连接
        Connection connection = factory.newConnection();

        //创建消息信道
        Channel channel = connection.createChannel();

        //消息队列
        channel.queueDeclare(QUEUE_NAME, true, false, false, null);
        System.out.println("[*] Waiting for message. To exist press CTRL+C");

        AtomicInteger count = new AtomicInteger(0);

        //消费者用于获取消息信道绑定的消息队列中的信息
        Consumer consumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties,
                                       byte[] body) throws IOException {
                String message = new String(body, "UTF-8");

                try {
                    System.out.println(" [x] Received '" + message);
                } finally {
                    System.out.println(" [x] Done");
                    channel.basicAck(envelope.getDeliveryTag(), false);
                }
            }
        };
        channel.basicConsume(QUEUE_NAME, false, consumer);

        Thread.sleep(1000 * 60);
    }
}
