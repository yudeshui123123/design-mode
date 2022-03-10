import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * TODO
 *
 * @author yds
 * @version 1.0
 * @date 2022/3/10 17:08
 * @description:
 */
public class MyTester {

    @Test
    public void Test01(){
        MyTest myTest = new MyTest();
        myTest.setId(1);
        myTest.setName("小明");
        myTest.setTime(new Date());
        MyTest clone = myTest.clone();
        clone.getTime().setTime(0);
        MyTest myTest1 = myTest.deepClone();
        myTest1.setTime(new Date());
        System.out.println("123");
    }
}
