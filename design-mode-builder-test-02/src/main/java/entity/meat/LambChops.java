package entity.meat;

import entity.Food;

import java.math.BigDecimal;

/**
 * TODO
 *
 * @author yds
 * @version 1.0
 * @date 2022/3/10 9:38
 * @description:
 * 羊排
 */
public class LambChops implements Food {
    @Override
    public String name() {
        return "羊排";
    }

    @Override
    public Double weight() {
        return 80D;
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal("9.9");
    }

    @Override
    public String desc() {
        return "好吃的羊排，孜然味";
    }
}
