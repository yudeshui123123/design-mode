package entity.meatballs;

import entity.Food;

import java.math.BigDecimal;

/**
 * TODO
 *
 * @author yds
 * @version 1.0
 * @date 2022/3/10 9:47
 * @description:
 * 甜不辣
 */
public class Tempura implements Food {
    @Override
    public String name() {
        return "甜不辣";
    }

    @Override
    public Double weight() {
        return 30D;
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal("4");
    }

    @Override
    public String desc() {
        return "大众的选择，最美甜不辣";
    }
}
