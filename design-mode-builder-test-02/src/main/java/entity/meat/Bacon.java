package entity.meat;

import entity.Food;

import java.math.BigDecimal;

/**
 * TODO
 *
 * @author yds
 * @version 1.0
 * @date 2022/3/10 9:33
 * @description:
 * 培根
 */
public class Bacon implements Food {

    @Override
    public String name() {
        return "培根";
    }

    @Override
    public Double weight() {
        return 20D;
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal("4.9");
    }

    @Override
    public String desc() {
        return "好吃的培根，咸咸的";
    }
}
