package builder;

import entity.meat.Bacon;
import entity.meat.LambChops;
import entity.meatballs.JuicyBeefBall;
import entity.meatballs.Tempura;
import entity.staplefood.Noodle;
import entity.staplefood.Vermicelli;
import entity.vegetables.BabyCabbage;
import entity.vegetables.Spinach;

/**
 * TODO
 *
 * @author yds
 * @version 1.0
 * @date 2022/3/10 9:06
 * @description:
 */
public class RenovationBuilder {

    /**
     * 豪华单人套餐
     */
    public static String getDeluxeSinglePackage(){
        FoodWrapper foodWrapper = new FoodWrapperImpl("豪华单人套餐");
        return foodWrapper.addFood(new Spinach())
                .addFood(new BabyCabbage())
                .addFood(new Noodle())
                .addFood(new Vermicelli())
                .addFood(new JuicyBeefBall())
                .addFood(new Tempura())
                .addFood(new Bacon())
                .addFood(new LambChops())
                .detailed();
    }

    /**
     * 轻奢单人套餐
     */
    public static String getLightLuxurySinglePackage(){
        FoodWrapper foodWrapper = new FoodWrapperImpl("轻奢单人套餐");
        return foodWrapper.addFood(new Spinach())
                .addFood(new BabyCabbage())
                .addFood(new Vermicelli())
                .addFood(new Tempura())
                .addFood(new LambChops())
                .detailed();
    }

    /**
     * 素食主义者
     */
    public static String getVegetarian(){
        FoodWrapper foodWrapper = new FoodWrapperImpl("素食主义者");
        return foodWrapper.addFood(new Spinach())
                .addFood(new BabyCabbage())
                .detailed();
    }
}
