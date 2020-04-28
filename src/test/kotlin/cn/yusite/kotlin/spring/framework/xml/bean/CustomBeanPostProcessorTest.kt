package cn.yusite.kotlin.spring.framework.xml.bean

import org.junit.Test
import org.springframework.context.support.ClassPathXmlApplicationContext

/**
 * 参考实现RequiredAnnotationBeanPostProcessor
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