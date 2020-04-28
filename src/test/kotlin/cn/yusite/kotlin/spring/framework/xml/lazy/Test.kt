package cn.yusite.kotlin.spring.framework.xml.lazy

import org.springframework.beans.factory.getBean
import org.springframework.context.support.ClassPathXmlApplicationContext
import kotlin.test.Test

class LazyTest {

    /**
     * 1：lazy bean
     */
    @Test
    fun `lazy bean test`() {

        val context = ClassPathXmlApplicationContext("lazy/beans.xml")
        context.beanFactory.beanNamesIterator.forEach {
            println(it)
        }
        context.getBean<LazyBean>("lazy")
        println("====".repeat(10))
        context.beanFactory.beanNamesIterator.forEach {
            println(it)
        }
    }
}