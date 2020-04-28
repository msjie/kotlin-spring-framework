package cn.yusite.kotlin.spring.framework.xml.aware

import org.junit.Test
import org.springframework.context.support.ClassPathXmlApplicationContext

import org.springframework.beans.factory.getBean

class AwareTest {

    /**
     * 1，通知接口
     */
    @Test
    fun `application context aware test`() {

        val context = ClassPathXmlApplicationContext("aware/beans.xml")
        val bean = context.getBean<Q>("q")
        bean.hi()
    }
}