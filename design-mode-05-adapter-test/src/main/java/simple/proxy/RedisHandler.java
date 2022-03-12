package simple.proxy;


import simple.adapter.RedisAdapter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * TODO
 *
 * @author yds
 * @version 1.0
 * @date 2022/3/12 15:01
 * @description:
 * redis代理处理器
 */
public class RedisHandler implements InvocationHandler {

    private RedisAdapter adapter;

    public RedisHandler(RedisAdapter redisAdapter){
        this.adapter = redisAdapter;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(adapter,args);
    }
}
