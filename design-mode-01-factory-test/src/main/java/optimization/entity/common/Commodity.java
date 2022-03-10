package optimization.entity.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * TODO
 *
 * @author yds
 * @version 1.0
 * @date 2022/3/8 19:22
 * @description:
 * 商品类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Commodity {

    private String name;
    private BigDecimal price;
}
