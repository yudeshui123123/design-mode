package entity.staplefood;

import entity.Food;

import java.math.BigDecimal;

/**
 * TODO
 *
 * @author yds
 * @version 1.0
 * @date 2022/3/10 9:41
 * @description:
 * 挂面
 */
public class Vermicelli implements Food {
    @Override
    public String name() {
        return "挂面";
    }

    @Override
    public Double weight() {
        return 100D;
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal("3");
    }

    @Override
    public String desc() {
        return "高筋面粉制作而成的挂面，好吃不贵";
    }
}
