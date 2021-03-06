package cn.yusite.kotlin.spring.framework.xml.inner

import kotlin.test.Test

import org.springframework.beans.factory.getBean
import org.springframework.context.support.ClassPathXmlApplicationContext

class Test {

    /**
     * 1：内部bean
     */
    @Test
    fun `inner bean test`(): Unit {

        val context = ClassPathXmlApplicationContext("inner/beans.xml")
        var bean = context.getBean<Outer>("outer")
        bean.target.hi()
        context.beanFactory.beanNamesIterator.forEach {
            println(it)
        }
    }
}