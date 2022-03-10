package builder;

import entity.Food;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author yds
 * @version 1.0
 * @date 2022/3/10 11:21
 * @description:
 */
public class FoodWrapperImpl implements FoodWrapper{

    //套餐名称
    private String packageName;
    //套餐价格
    private BigDecimal price = BigDecimal.ZERO;
    //套餐重量
    private Double weight = 0D;

    private List<Food> foodList = new ArrayList<>();

    public FoodWrapperImpl(){

    }
    public FoodWrapperImpl(String packageName){
        this.packageName = packageName;
    }

    /**
     * 添加食物
     */
    @Override
    public FoodWrapper addFood(Food food) {
        foodList.add(food);
        weight += food.weight();
        price = price.add(food.price());
        return this;
    }

    /**
     * 输出信息
     */
    @Override
    public String detailed() {
        StringBuffer sb = new StringBuffer();
        sb.append("名称："+packageName);
        sb.append("价格："+price);
        sb.append("重量："+weight);
        for (Food food : foodList) {
            sb.append(food);
        }
        return sb.toString();
    }
}
