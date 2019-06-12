package com.java234.jedis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @author gaoxu
 * @date 2019-06-12 13:49
 * @description ... 类
 */
public class JedisPoolTest {
    public static void main(String[] args) {
        JedisPoolConfig config = new JedisPoolConfig();   // 连接池的配置对象
        config.setMaxTotal(100); // 设置最大连接数
        config.setMaxIdle(10); // 设置最大空闲连接数

        JedisPool jedisPool = new JedisPool(config, "47.244.180.90", 6379);
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();    // 获取连接
            jedis.auth("123456");    // 设置密码
            jedis.set("name", "java知识分享网");     // 设置值
            String value = jedis.get("name");     // 获取值
            System.out.println(value);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (jedis != null) {
                jedis.close();
            }
            if (jedisPool != null) {
                jedisPool.close();
            }
        }
    }
}
