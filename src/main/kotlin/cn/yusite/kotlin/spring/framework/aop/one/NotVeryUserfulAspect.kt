package cn.yusite.kotlin.spring.framework.aop.one

import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.aspectj.lang.annotation.Pointcut
import org.springframework.stereotype.Component

@Aspect
@Component
class NotVeryUserfulAspect {

    @Before("execution(public * cn.yusite.kotlin.spring.framework.aop.one.CustomService.*(..))")
    fun addUser(){

        println("add user method")
    }

}