package cn.yusite.kotlin.spring.framework.chapter.two

import org.junit.Test
import org.springframework.context.support.ClassPathXmlApplicationContext

import org.springframework.beans.factory.getBean

class InstanceTest {

    /**
     * 使用构造函数初始化
     */
    @Test
    fun `primary constructor install`(): Unit {

        var beanFactory = ClassPathXmlApplicationContext("chapter2/beans.xml")
        var bean = beanFactory.getBean<ExampleBean>("exampleBean")
        println(bean)
    }

    /**
     * 使用静态工厂初始化
     */
    @Test
    fun `primary static factory install`(): Unit {

        var beanFactory = ClassPathXmlApplicationContext("chapter2/beans.xml")
        var bean = beanFactory.getBean<StaticFactory>("staticFactory")
        println(bean)
    }

    /**
     * 使用实例工厂方法初始化
     */
    @Test
    fun `primary instance factory install`(): Unit {

        var beanFactory = ClassPathXmlApplicationContext("chapter2/beans.xml")
        var exampleAnotherBean = beanFactory.getBean<ExampleAnotherBean>("exampleAnotherBean")
        println(exampleAnotherBean)
        exampleAnotherBean.hi()
    }
}