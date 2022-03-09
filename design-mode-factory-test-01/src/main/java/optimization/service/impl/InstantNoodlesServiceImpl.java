package optimization.service.impl;

import optimization.entity.food.InstantNoodles;
import optimization.service.FoodService;

/**
 * TODO
 *
 * @author yds
 * @version 1.0
 * @date 2022/3/9 9:48
 * @description:
 */
public class InstantNoodlesServiceImpl implements FoodService {

    private InstantNoodles instantNoodles = new InstantNoodles("白象","红烧牛肉");

    public void eat() {
        System.out.println("开始吃："+instantNoodles);
    }

    public void info() {
        System.out.println("方便面哦");
    }
}
