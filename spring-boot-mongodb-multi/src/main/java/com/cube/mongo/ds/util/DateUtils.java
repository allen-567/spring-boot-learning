package com.cube.mongo.ds.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;

/**
 * Author: 滕飞
 * Created: 2019-09-23 17:43
 * Description:
 */
public class DateUtils {

    /**
     * mongo 日期查询isodate
     * @param dateStr
     * @return
     */
    public static Date dateToISODate(String dateStr){
        //T代表后面跟着时间，Z代表UTC统一时间
        Date date = formatD(dateStr);
        SimpleDateFormat format =
                new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        format.setCalendar(new GregorianCalendar(new SimpleTimeZone(0, "GMT")));
        String isoDate = format.format(date);
        try {
            return format.parse(isoDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
    /** 时间格式(yyyy-MM-dd HH:mm:ss) */
    public final static String DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";

    public static Date formatD(String dateStr){
        return formatD(dateStr,DATE_TIME_PATTERN);
    }

    public static Date formatD(String dateStr ,String format)  {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        Date ret = null ;
        try {
            ret = simpleDateFormat.parse(dateStr) ;
        } catch (ParseException e) {
            //
        }
        return ret;
    }

}
