package cn.yusite.kotlin.spring.framework.chapter.three

import org.junit.Test
import org.springframework.context.support.ClassPathXmlApplicationContext

import org.springframework.beans.factory.getBean

class InstanceTest {

    /**
     * Dependence Injection (通过构造函数注入)
     */
    @Test
    fun `Dependence Injection constructor`(): Unit {

        var beanFactory = ClassPathXmlApplicationContext("chapter3/beans.xml")
        var bean = beanFactory.getBean<ThingOne>("beanOne")
        bean.hi()
    }

    /**
     * Dependence Injection (通过构造函数注入)
     */
    @Test
    fun `Dependence Injection second constructor`(): Unit {

        var beanFactory = ClassPathXmlApplicationContext("chapter3/beans.xml")
        var bean = beanFactory.getBean<ExampleBean>("exampleBean")
        bean.hi()
    }

    /**
     * Dependence Injection (通过构造函数注入)
     */
    @Test
    fun `Dependence Injection second2 constructor`(): Unit {

        var beanFactory = ClassPathXmlApplicationContext("chapter3/beans.xml")
        var bean = beanFactory.getBean<ExampleBean>("exampleBean2")
        bean.hi()
    }


    /**
     * Dependence Injection (通过setter方法注入)
     */
    @Test
    fun `Dependence Injection setter`(): Unit {

        var beanFactory = ClassPathXmlApplicationContext("chapter3/beans.xml")
        var bean = beanFactory.getBean<ThingFour>("thingFour")
        bean.hi()
    }
}