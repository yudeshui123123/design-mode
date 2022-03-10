import optimization.factory.JdkProxy;
import optimization.service.CommodityService;
import optimization.service.impl.ComputerServiceImpl;

/**
 * TODO
 *
 * @author yds
 * @version 1.0
 * @date 2022/3/9 16:39
 * @description:
 */
public class ProxyTest {

    public static void main(String[] args) {
        CommodityService commodityService = JdkProxy.get(ComputerServiceImpl.class, new ComputerServiceImpl());
        commodityService.info();
        ((ComputerServiceImpl)commodityService).param();
    }
}
