/**
 * The Apache License 2.0
 * Copyright (c) 2016 victor zhang
 */
package org.zp.notes.db.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;

/**
 * @author victor zhang
 * @date 2017/4/12.
 */
public abstract class AbstractBaseRedisDao<K, V> {

    @Autowired
    protected RedisTemplate<K, V> redisTemplate;

    /**
     * 设置redisTemplate
     */
    public void setRedisTemplate(RedisTemplate<K, V> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    /**
     * 获取 RedisSerializer
     */
    protected RedisSerializer<String> getRedisSerializer() {
        return redisTemplate.getStringSerializer();
    }
}
