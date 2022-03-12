import lombok.Data;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * TODO
 *
 * @author yds
 * @version 1.0
 * @date 2022/3/11 8:43
 * @description:
 * 单例类
 */
@Data
public class MySingle {

    private String name = "123";
    private String desc = "test";
    private AtomicInteger count = new AtomicInteger(0);

    private MySingle(){

    }

    private static volatile MySingle mySingle;

    public static MySingle getInstance(){
        if(null == mySingle){
            synchronized (MySingle.class){
                if(null == mySingle){
                    return mySingle = new MySingle();
                }
            }
        }
        return mySingle;
    }

    public String toString(){
        int i = count.incrementAndGet();
        return "序号为："+i+",名称为:"+name+",描述："+desc;
    }
}
