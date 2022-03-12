package simple.proxy;

import simple.adapter.RedisAdapter;

import java.lang.reflect.Proxy;

/**
 * TODO
 *
 * @author yds
 * @version 1.0
 * @date 2022/3/12 15:02
 * @description:
 * redis创建代理对象
 */
public class RedisProxy {

    public static <T> T getRedis(Class<T> c, RedisAdapter redisAdapter){
        return (T)Proxy.newProxyInstance(c.getClassLoader(),c.getInterfaces(),new RedisHandler(redisAdapter));
    }
}
