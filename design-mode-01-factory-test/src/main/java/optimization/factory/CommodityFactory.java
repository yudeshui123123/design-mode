package optimization.factory;

import optimization.entity.common.Commodity;
import optimization.service.CommodityService;

/**
 * TODO
 *
 * @author yds
 * @version 1.0
 * @date 2022/3/8 19:55
 * @description:
 */
public class CommodityFactory extends AbstractCommodityFactory{

    public <T extends CommodityService> T get(Class<T> t) {
        T t1 = null;
        try {
            t1 = t.newInstance();
        } catch (Exception e) {
            System.out.println("实例化对象失败");
            e.printStackTrace();
        }
        return t1;
    }
}
