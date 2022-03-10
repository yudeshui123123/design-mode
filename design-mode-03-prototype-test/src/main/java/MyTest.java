import lombok.Data;

import java.io.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Optional;

/**
 * TODO
 *
 * @author yds
 * @version 1.0
 * @date 2022/3/10 17:06
 * @description:
 */
@Data
public class MyTest implements Cloneable, Serializable {

    private String name;
    private int id;
    private Date time;

    @Override
    public MyTest clone(){
        try {
            return (MyTest)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public MyTest deepClone(){
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return (MyTest)ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
