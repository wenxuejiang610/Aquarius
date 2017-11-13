package com.nepxion.aquarius.common.redis.handler;

/**
 * <p>Title: Nepxion Aquarius</p>
 * <p>Description: Nepxion Aquarius</p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @email 1394997@qq.com
 * @version 1.0
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;

import com.nepxion.aquarius.common.redis.constant.RedisConstant;

public class RedisHandler {
    private static final Logger LOG = LoggerFactory.getLogger(RedisHandler.class);

    // 创建RedisTemplate
    @SuppressWarnings({ "unchecked", "resource" })
    public static RedisTemplate<String, Object> createRedisTemplate() {
        LOG.info("Start to initialize RedisTemplate...");

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:" + RedisConstant.CONFIG_FILE);

        return (RedisTemplate<String, Object>) applicationContext.getBean("aquariusRedisTemplate");
    }

    // 关闭Redis客户端连接
    public static void closeRedisson(RedisTemplate<String, Object> redisTemplate) {
        LOG.info("Start to close Redis...");
    }

    // Redis客户端连接是否正常
    public static boolean isStarted(RedisTemplate<String, Object> redisTemplate) {
        return true;
    }
}