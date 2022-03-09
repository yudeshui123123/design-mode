package notOptimized.service;


/**
 * TODO
 *
 * @author yds
 * @version 1.0
 * @date 2022/3/8 15:24
 * @description:
 */
public class PencilService {
    public String getPencil(String color,String brand){
        System.out.println("得到了铅笔，颜色为："+color+",品牌是："+brand+"");
        return "获得了铅笔";
    }
}
