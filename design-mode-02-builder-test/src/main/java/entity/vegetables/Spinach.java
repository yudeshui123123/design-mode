package entity.vegetables;

import entity.Food;

import java.math.BigDecimal;

/**
 * TODO
 *
 * @author yds
 * @version 1.0
 * @date 2022/3/10 9:42
 * @description:
 * 菠菜
 */
public class Spinach implements Food {
    @Override
    public String name() {
        return "菠菜";
    }

    @Override
    public Double weight() {
        return 30D;
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal("3.6");
    }

    @Override
    public String desc() {
        return "微甜菠菜，营养小能手";
    }
}
