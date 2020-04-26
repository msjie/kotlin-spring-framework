package cn.yusite.kotlin.spring.framework.chapter.three

import org.junit.Test
import org.springframework.context.support.ClassPathXmlApplicationContext

import org.springframework.beans.factory.getBean

class InstanceTest {

    /**
     * Dependence Injection (通过构造函数注入)
     */
    @Test
    fun `Dependence Injection onstructor`(): Unit {

        var beanFactory = ClassPathXmlApplicationContext("chapter3/beans.xml")
        var bean = beanFactory.getBean<ThingOne>("beanOne")
        bean.hi()
    }

}