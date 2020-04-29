package cn.yusite.kotlin.spring.framework.xml.bean

import org.junit.Test
import org.springframework.context.support.ClassPathXmlApplicationContext

/**
 * 参考实现RequiredAnnotationBeanPostProcessor
 *
 * 一些Spring AOP基础结构类被实现为bean后处理器，以提供代理包装逻辑
 *
 * 由于BeanPostProcessor Bean的特殊性，需要提前实例化以便用于其他实例bean的初始化
 */
internal class CustomBeanPostProcessorTest {

    /**
     * 1，自定义beanPostProcessor
     */
    @Test
    fun `custom bean post processor test`() {

        val context = ClassPathXmlApplicationContext("bean/beans.xml")
    }
}