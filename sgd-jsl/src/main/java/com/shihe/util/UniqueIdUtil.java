package com.shihe.util;

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
        return uuid.toString().replace("\\-", "");
    }
}
