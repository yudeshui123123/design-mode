package optimization.entity.stationery;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import optimization.entity.common.Commodity;

/**
 * TODO
 *
 * @author yds
 * @version 1.0
 * @date 2022/3/8 19:14
 * @description:
 * 铅笔类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pencil  extends Commodity {
    private String brand;
    private String color;

    @Override
    public String toString() {
        return "Pencil{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
