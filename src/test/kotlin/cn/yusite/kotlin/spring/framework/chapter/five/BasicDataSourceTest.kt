package cn.yusite.kotlin.spring.framework.chapter.five

import org.apache.commons.dbcp2.BasicDataSource
import org.junit.Test
import org.springframework.context.support.ClassPathXmlApplicationContext

import org.springframework.beans.factory.getBean

class BasicDataSourceTest {

    @Test
    fun `basic datasource instance`() {

        val beanFactory = ClassPathXmlApplicationContext("chapter5/beans.xml")
        val bean = beanFactory.getBean<BasicDataSource>("basicDataSource")
        println(bean.connection)
    }

}