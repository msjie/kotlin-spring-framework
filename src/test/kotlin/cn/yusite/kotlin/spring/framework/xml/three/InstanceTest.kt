package cn.yusite.kotlin.spring.framework.xml.three

import org.junit.Test
import org.springframework.context.support.ClassPathXmlApplicationContext

import org.springframework.beans.factory.getBean

class InstanceTest {

    /**
     * Dependence Injection (通过构造函数注入)
     */
    @Test
    fun `Dependence Injection constructor`() {

        val beanFactory = ClassPathXmlApplicationContext("chapter3/beans.xml")
        val bean = beanFactory.getBean<ThingOne>("beanOne")
        bean.hi()
    }

    /**
     * Dependence Injection (通过构造函数注入)
     */
    @Test
    fun `Dependence Injection second constructor`() {

        val beanFactory = ClassPathXmlApplicationContext("chapter3/beans.xml")
        val bean = beanFactory.getBean<ExampleBean>("exampleBean")
        bean.hi()
    }

    /**
     * Dependence Injection (通过构造函数注入)
     */
    @Test
    fun `Dependence Injection second2 constructor`() {

        val beanFactory = ClassPathXmlApplicationContext("chapter3/beans.xml")
        val bean = beanFactory.getBean<ExampleBean>("exampleBean2")
        bean.hi()
    }


    /**
     * Dependence Injection (通过setter方法注入)
     */
    @Test
    fun `Dependence Injection setter`() {

        val beanFactory = ClassPathXmlApplicationContext("chapter3/beans.xml")
        val bean = beanFactory.getBean<ThingFour>("thingFour")
        bean.hi()
    }

    /**
     * Dependence Injection (通过静态工厂方法注入)
     */
    @Test
    fun `Dependence Injection static factory`() {

        val beanFactory = ClassPathXmlApplicationContext("chapter3/beans.xml")
        val bean = beanFactory.getBean<ExampleBean>("exampleBean3")
        bean.hi()
    }
}