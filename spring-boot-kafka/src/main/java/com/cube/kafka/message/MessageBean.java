package com.cube.kafka.message;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Author: 滕飞
 * Created: 2019-10-11 16:19
 * Description:消息实体类
 */
@Data
public class MessageBean implements Serializable {

    /** uuid */
    private String uuid;

    /** 时间  */
    private Date date;

}