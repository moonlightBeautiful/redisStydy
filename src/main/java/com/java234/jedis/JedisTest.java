package com.java234.jedis;

import redis.clients.jedis.Jedis;

/**
 * @author gaoxu
 * @date 2019-06-12 13:18
 * @description ... 类
 */
public class JedisTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("47.244.180.90", 6379);  // 创建客户端 设置IP和端口
        jedis.auth("123456");
        jedis.set("name", "java֪1234");        // 设置值
        String value = jedis.get("name");    // 获取值
        System.out.println(value);
        jedis.close();        // 释放连接资源
    }
}
