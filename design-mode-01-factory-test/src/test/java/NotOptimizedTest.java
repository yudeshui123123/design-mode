import notoptimized.controller.CommodityController;

/**
 * TODO
 *
 * @author yds
 * @version 1.0
 * @date 2022/3/3 16:54
 * @description:
 */
public class NotOptimizedTest {

    public static void main(String[] args) {
        CommodityController commodityController = new CommodityController();
        commodityController.purchase(1);
        commodityController.purchase(2);
        commodityController.purchase(3);
    }
}
