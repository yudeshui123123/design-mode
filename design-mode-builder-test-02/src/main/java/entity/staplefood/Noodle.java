package entity.staplefood;

import entity.Food;

import java.math.BigDecimal;

/**
 * TODO
 *
 * @author yds
 * @version 1.0
 * @date 2022/3/10 9:39
 * @description:
 */
public class Noodle implements Food {
    @Override
    public String name() {
        return "手擀面";
    }

    @Override
    public Double weight() {
        return 100D;
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal("4");
    }

    @Override
    public String desc() {
        return "纯手工制作后擀面，筋道十足";
    }
}
