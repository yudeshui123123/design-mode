package optimization.factory;

import optimization.service.CommodityService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * TODO
 *
 * @author yds
 * @version 1.0
 * @date 2022/3/9 16:14
 * @description:
 */
public class JdkProxy {

    public static <T>T get(Class<T> t,CommodityService commodityService){
        InvocationHandler invokeHandler = new InvokeHandler(commodityService);
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        Class<?>[] interfaces = t.getInterfaces();
        Object o = Proxy.newProxyInstance(contextClassLoader, new Class[]{interfaces[0]}, invokeHandler);
        return (T)o;
    }
}
