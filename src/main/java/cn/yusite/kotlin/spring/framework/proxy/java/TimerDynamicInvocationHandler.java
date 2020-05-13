package cn.yusite.kotlin.spring.framework.proxy.java;

import lombok.extern.log4j.Log4j2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

/**
 * 耗时统计
 */
@Log4j2
public class TimerDynamicInvocationHandler implements InvocationHandler {

    private Map<String, Method> methodMap;

    private Object target;

    public TimerDynamicInvocationHandler(Object target) {

        this.target = target;
        this.methodMap = Arrays.asList(target.getClass().getMethods())
                .stream()
                .collect(toMap(Method::getName, method -> method, (o1, o2) -> o1));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

//        log.debug("proxy {}",proxy.toString());
        log.debug("method name is {}",method.getName());
        log.debug("args value is {}",Arrays.asList(args));
        //调用目标对象方法
        Object result = methodMap.get(method.getName()).invoke(target, args);
        return result;
    }
}
