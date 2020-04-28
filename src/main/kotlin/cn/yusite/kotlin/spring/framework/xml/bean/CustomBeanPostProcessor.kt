package cn.yusite.kotlin.spring.framework.xml.bean

import org.springframework.beans.factory.config.BeanPostProcessor

/**
 * 参考实现RequiredAnnotationBeanPostProcessor
 */
class CustomBeanPostProcessor : BeanPostProcessor {

    /**
     * 在所有bean声明周期初始化回调函数之前执行
     */
    override fun postProcessBeforeInitialization(bean: Any, beanName: String): Any? {

        println("postProcessBeforeInitialization $bean : $beanName")
        return super.postProcessBeforeInitialization(bean, beanName)
    }

    /**
     * 在所有bean声明周期初始化回调函数之后执行
     */
    override fun postProcessAfterInitialization(bean: Any, beanName: String): Any? {

        println("postProcessAfterInitialization $bean : $beanName")
        return super.postProcessAfterInitialization(bean, beanName)
    }
}