package entity.meatballs;

import entity.Food;

import java.math.BigDecimal;

/**
 * TODO
 *
 * @author yds
 * @version 1.0
 * @date 2022/3/10 9:45
 * @description:
 * 撒尿牛丸
 */
public class JuicyBeefBall implements Food {
    @Override
    public String name() {
        return "撒尿牛丸";
    }

    @Override
    public Double weight() {
        return 50D;
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal("4.5");
    }

    @Override
    public String desc() {
        return "手工撒尿牛丸，便宜的价格，奢华的享受";
    }
}
