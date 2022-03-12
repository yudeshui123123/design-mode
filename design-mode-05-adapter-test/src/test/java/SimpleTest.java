import org.junit.Test;
import simple.adapter.RedisAdapter;
import simple.adapter.RedisOneAdapter;
import simple.adapter.RedisTwoAdapter;
import simple.proxy.RedisProxy;

/**
 * TODO
 *
 * @author yds
 * @version 1.0
 * @date 2022/3/12 15:00
 * @description:
 */
public class SimpleTest {

    @Test
    public void Test01(){
        RedisAdapter redis = RedisProxy.getRedis(RedisOneAdapter.class, new RedisOneAdapter());
        redis.print();

        RedisAdapter redis2 = RedisProxy.getRedis(RedisTwoAdapter.class, new RedisTwoAdapter());
        redis2.print();
    }
}
