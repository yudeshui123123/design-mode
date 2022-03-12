package simple.adapter;

import simple.source.RedisTwo;

/**
 * TODO
 *
 * @author yds
 * @version 1.0
 * @date 2022/3/12 14:59
 * @description:
 * 对象适配器
 */
public class RedisTwoAdapter implements RedisAdapter{

    private RedisTwo redisTwo = new RedisTwo();

    @Override
    public void print() {
        System.out.println(redisTwo.getMsg());
    }
}
