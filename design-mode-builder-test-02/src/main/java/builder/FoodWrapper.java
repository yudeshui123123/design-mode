package builder;

import entity.Food;

/**
 * TODO
 *
 * @author yds
 * @version 1.0
 * @date 2022/3/10 11:17
 * @description:
 */
public interface FoodWrapper {

    //添加食物
    FoodWrapper addFood(Food food);

    //输出明细
    String detailed();
}
