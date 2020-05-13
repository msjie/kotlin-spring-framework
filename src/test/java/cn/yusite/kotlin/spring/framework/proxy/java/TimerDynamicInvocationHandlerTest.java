package cn.yusite.kotlin.spring.framework.proxy.java;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class TimerDynamicInvocationHandlerTest {

    @Test
    public void testProxy(){

        Map<String, String> map = new HashMap<>();
        TimerDynamicInvocationHandler timerDynamicInvocationHandler = new TimerDynamicInvocationHandler(map);
        //create proxy instance
        Map o = (Map)Proxy.newProxyInstance(TimerDynamicInvocationHandlerTest.class.getClassLoader(),
                new Class[]{Map.class}, timerDynamicInvocationHandler);
        o.put("name", "msjie");
        map.entrySet().forEach(stringStringEntry -> {
            System.out.println(stringStringEntry.getKey());
            System.out.println(stringStringEntry.getValue());
        });
    }

    @Test
    public void test(){

        Map<Object, Object> target = new HashMap<>();
        Map mapProxyInstance = (Map) Proxy.newProxyInstance(
                TimerDynamicInvocationHandler.class.getClassLoader(), new Class[] { Map.class },
                new TimerDynamicInvocationHandler(target));
        mapProxyInstance.put("hello", "world");
        Assert.assertEquals("world",target.get("hello"));
    }

    @Test
    public void testProxyClass(){

        Class<?> proxyClass = Proxy.getProxyClass(this.getClass().getClassLoader(), new Class[]{Map.class});
        System.out.println(proxyClass);
    }
}