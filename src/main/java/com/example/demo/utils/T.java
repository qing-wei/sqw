package com.example.demo.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class T {
    public static String getOrderIdByUserIdAndTimestamp(int userId) {
        long mills = System.currentTimeMillis();
        String hashKey = "" + userId + mills;
        int hashCodeV = hashKey.hashCode();
        //有可能是负数
        if(hashCodeV < 0) {
            hashCodeV = - hashCodeV;
        }
        // 0 代表前面补充0
        // 15 代表长度为15
        // d 代表参数为正数型
        return String.format("%016d", hashCodeV);
    }

    public static String getOrderIdByUserIdAndDateTime(int userId) {
        String dateTimeStr = DateTimeFormatter.ofPattern("yyyyMMddHHmmss").format(LocalDateTime.now());
        String hashKey = "" + userId + dateTimeStr;
        int hashCodeV = hashKey.hashCode();
        //有可能是负数
        if(hashCodeV < 0) {
            hashCodeV = - hashCodeV;
        }
        // 0 代表前面补充0
        // 15 代表长度为15
        // d 代表参数为正数型
        return String.format("%016d", hashCodeV);
    }

    public static String getOrderIdByUUId() {
        //最大支持1-9个集群机器部署
        int machineId = 1;
        int hashCodeV = UUID.randomUUID().toString().hashCode();
        //有可能是负数
        if(hashCodeV < 0) {
            hashCodeV = - hashCodeV;
        }
        // 0 代表前面补充0
        // 15 代表长度为15
        // d 代表参数为正数型
        return machineId + String.format("%015d", hashCodeV);
    }
    public static void main(String[] args) {
        System.out.println(getOrderIdByUUId());
        int userId = 100000;
        System.out.println(getOrderIdByUserIdAndTimestamp(userId));
        System.out.println(getOrderIdByUserIdAndDateTime(userId));
        System.out.println(System.currentTimeMillis());
        String dateTimeStr = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS").format(LocalDateTime.now());
        String hashKey = "" + userId + dateTimeStr;

        System.out.println(HashAlgorithms.APHash(hashKey));
        System.out.println(HashAlgorithms.bernstein(hashKey));

        System.out.println(HashAlgorithms.BKDRHash(hashKey));
        System.out.println(HashAlgorithms.DEKHash(hashKey));

        System.out.println(HashAlgorithms.DJBHash(hashKey));
        System.out.println(HashAlgorithms.ELFHash(hashKey));

        System.out.println(HashAlgorithms.FNVHash(hashKey.getBytes()));
        System.out.println(HashAlgorithms.FNVHash1(hashKey));
        System.out.println(HashAlgorithms.FNVHash1(hashKey.getBytes()));

//        System.out.println(HashAlgorithms.intHash(hashKey));
        System.out.println(HashAlgorithms.java(hashKey));

        System.out.println(HashAlgorithms.JSHash(hashKey));
        System.out.println(HashAlgorithms.mixHash(hashKey));

        System.out.println(HashAlgorithms.oneByOneHash(hashKey));
        System.out.println(HashAlgorithms.PJWHash(hashKey));

        System.out.println(HashAlgorithms.RSHash(hashKey));
        System.out.println(HashAlgorithms.SDBMHash(hashKey));
    }
}