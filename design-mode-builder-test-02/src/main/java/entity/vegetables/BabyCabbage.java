package entity.vegetables;

import entity.Food;

import java.math.BigDecimal;

/**
 * TODO
 *
 * @author yds
 * @version 1.0
 * @date 2022/3/10 9:44
 * @description:
 * 娃娃菜
 */
public class BabyCabbage implements Food {
    @Override
    public String name() {
        return "娃娃菜";
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
        return "香嫩可口的娃娃菜，贼好吃";
    }
}
