package com.shihe.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @ClassName UniqueIdUtil
 * @Description TODO
 * @Author admin
 * @Date 2021-02-07 11:25
 * @Version 1.0
 */
public class UniqueIdUtil {

    public static String genId(){
        UUID uuid = UUID.randomUUID();
        return uuid.toString().replaceAll("\\-","");
    }

    public static String genDateId(){
        Date date = new Date();//获取当前的日期
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");//设置日期格式
        String str = df.format(date);//获取String类型的时间
        return genId()+str;
    }


    public static void main(String[] args) {
        /*UUID uuid = UUID.randomUUID();
        System.out.println(uuid.toString());
        System.out.println(uuid.toString().replaceAll("\\-",""));*/
        Date date = new Date();//获取当前的日期
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");//设置日期格式
        String str = df.format(date);//获取String类型的时间
        System.out.println(str);
    }

}
