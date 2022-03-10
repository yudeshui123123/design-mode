package optimization.entity.food;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import optimization.entity.common.Commodity;

/**
 * TODO
 *
 * @author yds
 * @version 1.0
 * @date 2022/3/8 17:07
 * @description:
 * 方便面类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InstantNoodles extends Commodity {
    private String brand;//品牌
    private String flavor;//口味

    @Override
    public String toString() {
        return "InstantNoodles{" +
                "brand='" + brand + '\'' +
                ", flavor='" + flavor + '\'' +
                '}';
    }
}
