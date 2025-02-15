package com.abing.core.proxy;

import java.lang.reflect.Proxy;

/**
 * @Author CaptainBing
 * @Date 2024/9/30 14:04
 * @Description
 */
public class ServiceProxyFactory {

    /**
     * 获取代理对象
     * @param serviceClass
     * @return
     * @param <T>
     */
    public static <T> T getProxy(Class<T> serviceClass){
        return (T) Proxy.newProxyInstance(
                serviceClass.getClassLoader(),
                new Class[]{serviceClass},
                new ServiceProxy());
    }

}
