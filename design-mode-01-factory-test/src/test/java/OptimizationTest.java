import optimization.factory.AbstractCommodityFactory;
import optimization.factory.CommodityFactory;
import optimization.service.impl.ComputerServiceImpl;
import optimization.service.impl.InstantNoodlesServiceImpl;
import optimization.service.impl.PencilServiceImpl;

/**
 * TODO
 *
 * @author yds
 * @version 1.0
 * @date 2022/3/9 9:12
 * @description:
 */
public class OptimizationTest {
    public static void main(String[] args) {
        AbstractCommodityFactory abstractCommodityFactory = new CommodityFactory();
        //计算机
        ComputerServiceImpl computerService = abstractCommodityFactory.get(ComputerServiceImpl.class);
        computerService.info();
        computerService.param();

        //方便面
        InstantNoodlesServiceImpl instantNoodlesService = abstractCommodityFactory.get(InstantNoodlesServiceImpl.class);
        instantNoodlesService.info();
        instantNoodlesService.eat();

        //铅笔
        PencilServiceImpl pencilService = abstractCommodityFactory.get(PencilServiceImpl.class);
        pencilService.info();
        pencilService.work();
    }
}
