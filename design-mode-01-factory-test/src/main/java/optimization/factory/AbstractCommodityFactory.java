package optimization.factory;

import optimization.service.CommodityService;

/**
 * TODO
 *
 * @author yds
 * @version 1.0
 * @date 2022/3/8 19:27
 * @description:
 * 商品类工厂
 */
public abstract class AbstractCommodityFactory {
    //获取
    public abstract <T extends CommodityService>  T get(Class<T> t);
}
