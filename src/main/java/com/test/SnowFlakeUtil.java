package com.test;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

/**
 * 随机数demo
 * 雪花算法实现demo
 */
public class SnowFlakeUtil {

    // 起始时间戳
    private final static long START_STMP = 0L;

    // 每部分的位数
    private final static long SEQUENCE_BIT = 12; // 序列号占用位数
    private final static long MACHINE_BIT = 5; // 机器id占用位数
    private final static long DATACENTER_BIT = 5; // 机房id占用位数

    // 每部分最大值
    private final static long MAX_DATACENTER_NUM = -1L ^ (-1L << DATACENTER_BIT);
    private final static long MAX_MACHINE_NUM = -1L ^ (-1L << MACHINE_BIT);
    private final static long MAX_SEQUENCE = -1L ^ (-1L << SEQUENCE_BIT);

    // 每部分向左的位移
    private final static long MACHINE_LEFT = SEQUENCE_BIT;
    private final static long DATACENTER_LEFT = SEQUENCE_BIT + MACHINE_BIT;
    private final static long TIMESTMP_LEFT = DATACENTER_LEFT + DATACENTER_BIT;

    private final long datacenterId; // 机房id
    private final long machineId; // 机器id
    private long sequence = 0L; // 序列号
    private long lastStmp = -1L; // 上次的时间戳

    public SnowFlakeUtil(long datacenterId, long machineId) {
        if (datacenterId > MAX_DATACENTER_NUM || datacenterId < 0) {
            throw new IllegalArgumentException("datacenterId can't be greater than MAX_DATACENTER_NUM or less than 0");
        }
        if (machineId > MAX_MACHINE_NUM || machineId < 0) {
            throw new IllegalArgumentException("machineId can't be greater than MAX_MACHINE_NUM or less than 0");
        }
        this.datacenterId = datacenterId;
        this.machineId = machineId;
    }

    // 产生下一个ID
    public synchronized long getNextId() {
        long currStmp = getNewstmp();
        if (currStmp < lastStmp) {
            throw new RuntimeException("Clock moved backwards.Refusing to generate id");
        }
        if (currStmp == lastStmp) {
            // 若在相同毫秒内 序列号自增
            sequence = (sequence + 1) & MAX_SEQUENCE;
            // 同一毫秒的序列数已达到最大
            if (sequence == 0L) {
                currStmp = getNextMill();
            }
        } else {
            // 若在不同毫秒内 则序列号置为0
            sequence = 0L;
        }
        lastStmp = currStmp;

        return (currStmp - START_STMP) << TIMESTMP_LEFT // 时间戳部分
                | datacenterId << DATACENTER_LEFT // 机房id部分
                | machineId << MACHINE_LEFT // 机器id部分
                | sequence; // 序列号部分
    }

    // 获取新的毫秒数
    private long getNextMill() {
        long mill = getNewstmp();
        while (mill <= lastStmp) {
            mill = getNewstmp();
        }
        return mill;
    }

    // 获取当前的毫秒数
    private long getNewstmp() {
        return System.currentTimeMillis();
    }

    public static void main(String[] args) {

        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        char c = 'e';
        char x = 'w';
        for (int i = 0; i < 4; i++) {
            //随机生成大写的英文字母
            c = (char) (random.nextInt((26)) + 65);
            //随机生成小写的英文字母
            x = (char) (random.nextInt((26)) + 97);
            stringBuilder.append(c);
            stringBuilder2.append(x);
        }
        System.out.println(stringBuilder + "\t" + stringBuilder2);
        SnowFlakeUtil snowFlakeUtil = new SnowFlakeUtil(3, 5);
        System.out.println("雪花算法获得：\t"+snowFlakeUtil.getNextId());
        UUID uuid = UUID.randomUUID();
        String replace = "";
        System.out.println(System.currentTimeMillis() + "\t" + new Date().getTime() + "\t" + uuid);
        Long l = 599083566539259904l;
        System.out.println(Long.MAX_VALUE + "\tlong的最大值为：\t");
        for (int i = 0; i < 1000; i++) {
            replace = uuid.toString().replaceAll("-", "");
        }
        System.out.println(replace);
    }
}