package cn.yusite.kotlin.spring.framework.xml.factory

import org.junit.Test
import org.springframework.context.support.ClassPathXmlApplicationContext

class CustomBeanFactoryPostProcessorTest {

    /**
     * 1，自定义beanFactoryPostProcessor
     */
    @Test
    fun `custom bean factory post processor test`() {

        ClassPathXmlApplicationContext("factory/beans.xml")
    }
}