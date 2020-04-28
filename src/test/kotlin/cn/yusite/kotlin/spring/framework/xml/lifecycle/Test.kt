package cn.yusite.kotlin.spring.framework.xml.lifecycle

import org.junit.Test
import org.springframework.beans.factory.getBean
import org.springframework.context.support.ClassPathXmlApplicationContext

class LifecycleTest {

    /**
     * 1：lifecycle singleton
     */
    @Test
    fun `lifecycle singleton test`() {

        val context = ClassPathXmlApplicationContext("lifecycle/beans.xml")
        println("====".repeat(10))
        context.getBean<A>("a")
        context.registerShutdownHook()
        println("====".repeat(10))
    }
}