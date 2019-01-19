package com.demo.common.redis;

import redis.clients.jedis.BinaryJedisCommands;
import redis.clients.jedis.JedisCommands;

public interface ShardingRedisClient extends BinaryJedisCommands, JedisCommands {
}
