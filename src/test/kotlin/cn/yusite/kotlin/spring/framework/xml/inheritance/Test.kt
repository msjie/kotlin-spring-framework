package cn.yusite.kotlin.spring.framework.xml.inheritance

import org.junit.Test
import org.springframework.context.support.ClassPathXmlApplicationContext

import org.springframework.beans.factory.getBean

class InheritanceTest {

    /**
     * 1，自动装配
     */
    @Test
    fun `application context aware test`() {

        val context = ClassPathXmlApplicationContext("inheritance/beans.xml")
        val bean = context.getBean<DerivedTestBean>("derivedTestBean")
        println(bean.name)
    }
}