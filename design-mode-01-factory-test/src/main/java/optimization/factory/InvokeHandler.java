package optimization.factory;

import optimization.service.CommodityService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * TODO
 *
 * @author yds
 * @version 1.0
 * @date 2022/3/9 16:16
 * @description:
 */
public class InvokeHandler implements InvocationHandler {

    //代理对象
    private CommodityService commodityService;

    public InvokeHandler(CommodityService commodityService){
        this.commodityService = commodityService;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = method.invoke(commodityService, args);
        return invoke;
    }
}
