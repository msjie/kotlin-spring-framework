package cn.yusite.kotlin.spring.framework.xml.four

import org.junit.Test
import org.springframework.context.support.ClassPathXmlApplicationContext

import org.springframework.beans.factory.getBean

class InstanceTest {

    /**
     * Dependence Injection (通过构造函数注入)
     */
    @Test
    fun `circular dependence`() {

        val beanFactory = ClassPathXmlApplicationContext("chapter4/beans.xml")
        val bean = beanFactory.getBean<Y>("y")
        bean.hi()
    }

}