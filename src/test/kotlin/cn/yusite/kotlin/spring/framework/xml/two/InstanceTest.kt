package cn.yusite.kotlin.spring.framework.xml.two

import org.junit.Test
import org.springframework.context.support.ClassPathXmlApplicationContext

import org.springframework.beans.factory.getBean

class InstanceTest {

    /**
     * 使用构造函数初始化
     */
    @Test
    fun `primary constructor install`() {

        val beanFactory = ClassPathXmlApplicationContext("chapter2/beans.xml")
        val bean = beanFactory.getBean<ExampleBean>("exampleBean")
        println(bean)
    }

    /**
     * 使用静态工厂初始化
     */
    @Test
    fun `primary static factory install`() {

        val beanFactory = ClassPathXmlApplicationContext("chapter2/beans.xml")
        val bean = beanFactory.getBean<StaticFactory>("staticFactory")
        println(bean)
    }

    /**
     * 使用实例工厂方法初始化
     */
    @Test
    fun `primary instance factory install`() {

        val beanFactory = ClassPathXmlApplicationContext("chapter2/beans.xml")
        val exampleAnotherBean = beanFactory.getBean<ExampleAnotherBean>("exampleAnotherBean")
        println(exampleAnotherBean)
        exampleAnotherBean.hi()
    }
}