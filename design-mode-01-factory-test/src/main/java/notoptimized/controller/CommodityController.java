package notoptimized.controller;

import notoptimized.service.ComputerService;
import notoptimized.service.FoodService;
import notoptimized.service.PencilService;

/**
 * TODO
 *
 * @author yds
 * @version 1.0
 * @date 2022/3/8 16:47
 * @description:
 */
public class CommodityController {

    public String purchase(Integer integer){
        if (integer == 1){
            ComputerService computerService = new ComputerService();
            computerService.getComputer("r53600",16,512);
        }
        if(integer == 2){
            FoodService foodService = new FoodService();
            foodService.getInstantNoodles("红烧牛肉","统一");
        }
        if(integer == 3){
            PencilService pencilService = new PencilService();
            pencilService.getPencil("绿色","2B");
        }
        return "购买完成";
    }
}
