package com.cube.kafka.controller;

import com.cube.kafka.message.MessageBean;
import com.cube.kafka.producer.KafkaProducer;
import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Author: 滕飞
 * Created: 2019-10-11 16:20
 * Description:消息控制器
 */
@Log
@Controller
@RequestMapping("/message")
public class MessageController {

    @Resource
    private KafkaProducer kafkaProducer;

    /**
     * 生成消息
     *
     * @return
     */
    @RequestMapping("create")
    @ResponseBody
    public Map<String, Object> create() {
        // 创建消息
        MessageBean messageBean = new MessageBean();
        String uuid = UUID.randomUUID().toString();
        messageBean.setUuid(uuid);
        messageBean.setDate(new Date());
        // 将消息发送到 kafka
        kafkaProducer.sendMessage(messageBean);
        Map<String, Object> model = new HashMap<>();
        // 返回成功信息
        model.put("resultCode", 1);
        model.put("resultMsg", "success");
        model.put("messageBean", messageBean);
        return model;
    }

}
