package com.cube.kafka.producer;

import com.alibaba.fastjson.JSON;
import com.cube.kafka.message.MessageBean;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Author: 滕飞
 * Created: 2019-10-11 16:18
 * Description: Kafka消息生产类
 */
@Log
@Component
public class KafkaProducer {

    @Resource
    private KafkaTemplate<String, String> kafkaTemplate;

    @Value("${kafka.topic.order}")
    private String topicOrder;

    /**
     * 发送消息
     *
     * @param messageBean 消息实例
     */
    public void sendMessage(MessageBean messageBean) {

        // 将消息实例序列化为json格式的字符串
        String message = JSON.toJSONString(messageBean);
        // 发送消息
        kafkaTemplate.send(topicOrder, message);
        // 打印消息
        log.info("\nminiooc send message：\n" + message);
    }
}