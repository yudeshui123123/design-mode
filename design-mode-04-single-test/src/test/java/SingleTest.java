import org.junit.Test;

import java.util.concurrent.*;

/**
 * TODO
 *
 * @author yds
 * @version 1.0
 * @date 2022/3/11 8:49
 * @description:
 */
public class SingleTest {

    @Test
    public void test01(){
//        MySingle instance = MySingle.getInstance();
//        MySingle instance2 = MySingle.getInstance();
        //使用多线程获取
        ExecutorService exec = new ThreadPoolExecutor(
                2,
                Runtime.getRuntime().availableProcessors()+1,
                10,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(200),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );
        for (int i = 0; i < 200; i++) {
            exec.execute(()->{
                MySingle instance1 = MySingle.getInstance();
                System.out.println(instance1);
            });
        }
        while(Thread.activeCount()>2){
            Thread.yield();
        }
        exec.shutdown();
    }
}
