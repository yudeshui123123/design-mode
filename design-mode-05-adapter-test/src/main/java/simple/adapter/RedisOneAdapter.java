package simple.adapter;

import simple.source.RedisOne;

/**
 * TODO
 *
 * @author yds
 * @version 1.0
 * @date 2022/3/12 14:58
 * @description:
 * 对象适配器
 */
public class RedisOneAdapter implements RedisAdapter{

    private RedisOne redisOne = new RedisOne();

    @Override
    public void print() {
        System.out.println(redisOne.getMessage());
    }
}
