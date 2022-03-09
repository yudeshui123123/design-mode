package notOptimized.service;

/**
 * TODO
 *
 * @author yds
 * @version 1.0
 * @date 2022/3/8 15:51
 * @description:
 */
public class FoodService {

    public String getInstantNoodles(String flavor,String brand){
        System.out.println("获得了方便面,口味是："+flavor+",品牌是"+brand+"");
        return "获得了方便面";
    }
}
