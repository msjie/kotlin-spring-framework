package cn.yusite.kotlin.spring.framework.chapter.lifecycle

import org.springframework.beans.factory.DisposableBean
import org.springframework.beans.factory.InitializingBean
import javax.annotation.PostConstruct
import javax.annotation.PreDestroy

/**
 * 接口定义的方法比xml指定的方法提前执行
 * 为同一个bean配置的具有不同初始化方法的多种生命周期机制称为：
 *
    用注释的方法 @PostConstruct

    afterPropertiesSet()由InitializingBean回调接口定义

    定制配置的init()方法

    销毁方法的调用顺序相同：

    用注释的方法 @PreDestroy

    destroy()由DisposableBean回调接口定义

    定制配置的destroy()方法

    启动和关机回调
 */
class A : InitializingBean,DisposableBean {

    @PostConstruct
    fun postConstructor() {

        println("@PostConstruct method")
    }

    /**
     * bean初始化回调
     */
    override fun afterPropertiesSet() {

        println(" a method afterPropertiesSet exec")
    }

    fun init(): Unit {

        println("init method")
    }

    @PreDestroy
    fun postDestroy(): Unit {

        println("post destroy")
    }

    /**
     * bean销毁回调
     */
    override fun destroy() {

        println(" a method destroy exec")
    }



    fun cleanup(): Unit {

        println("cleanup method")
    }
}