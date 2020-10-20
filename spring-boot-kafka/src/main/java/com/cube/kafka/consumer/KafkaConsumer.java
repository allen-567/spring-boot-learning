package com.cube.kafka.consumer;

import com.alibaba.fastjson.JSON;
import com.cube.kafka.message.MessageBean;
import lombok.extern.java.Log;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

/**
 * Author: 滕飞
 * Created: 2019-10-11 16:35
 * Description: Kafka消息消费类
 */
@Log
@Component
public class KafkaConsumer {

    @KafkaListener(topics = "${kafka.topic.order}", containerFactory = "kafkaListenerContainerFactory")
    public void consume(@Payload String message) {

        // 将接收到的消息反序列化消息实例
        MessageBean messageBean = JSON.parseObject(message, MessageBean.class);
        // 将消息实例序列化为json格式的字符串
        String json = JSON.toJSONString(messageBean);
        // 打印消息
        log.info("\nminiooc receive message：\n" + json);
    }
}
