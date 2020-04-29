package cn.yusite.kotlin.spring.framework.xml.factory

import cn.yusite.kotlin.spring.framework.xml.lifecycle.A
import org.apache.commons.dbcp2.BasicDataSource
import org.junit.Test
import org.springframework.beans.factory.getBean
import org.springframework.context.support.ClassPathXmlApplicationContext

class CustomBeanFactoryPostProcessorTest {

    /**
     * 1，自定义beanFactoryPostProcessor
     */
    @Test
    fun `custom bean factory post processor test`() {

        val classPathXmlApplicationContext = ClassPathXmlApplicationContext("factory/beans.xml")
        println(classPathXmlApplicationContext.getBean<A>("a"))
    }
    /**
     * 1，自定义beanFactoryPostProcessor
     */
    @Test
    fun `property editor bean factory post processor test`() {

        val classPathXmlApplicationContext = ClassPathXmlApplicationContext("factory/property.xml")
        println(classPathXmlApplicationContext.getBean<BasicDataSource>("basicDataSource"))
    }
}