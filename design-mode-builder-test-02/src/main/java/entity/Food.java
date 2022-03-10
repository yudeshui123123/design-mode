package entity;

import java.math.BigDecimal;

/**
 * TODO
 *
 * @author yds
 * @version 1.0
 * @date 2022/3/10 9:34
 * @description:
 */
public interface Food {
    String name(); //食物名称

    Double weight(); //重量

    BigDecimal price(); //价格

    String desc(); //描述
}
