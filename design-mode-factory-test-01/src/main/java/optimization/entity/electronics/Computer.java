package optimization.entity.electronics;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import optimization.entity.common.Commodity;

/**
 * TODO
 *
 * @author yds
 * @version 1.0
 * @date 2022/3/8 19:12
 * @description:
 * 电脑类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Computer  extends Commodity {

    private String cup;
    private String memory;
    private String hardDisk;

    @Override
    public String toString() {
        return "Computer{" +
                "cup='" + cup + '\'' +
                ", memory='" + memory + '\'' +
                ", hardDisk='" + hardDisk + '\'' +
                '}';
    }
}
