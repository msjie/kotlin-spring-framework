package cn.yusite.kotlin.spring.framework.chapter.method

import org.junit.Test
import org.springframework.beans.factory.getBean
import org.springframework.context.support.ClassPathXmlApplicationContext

class MethodTest {

    /**
     * 1，单例bean使用非单例bean解决方案(与spring框架强耦合，不符合spring开发理念)
     */
    @Test
    fun `singleton bean collaborate with prototype bean`() {

        val context = ClassPathXmlApplicationContext("method/beans.xml")
        context.beanFactory.beanNamesIterator.forEach {
            println(it)
        }
        val bean = context.getBean<CommandManager>("commandManager")
        val mapOf = mapOf("one" to "1")
        bean.process(mapOf)
        bean.process(mapOf)
        bean.process(mapOf)
        println("====".repeat(10))
        context.beanFactory.beanNamesIterator.forEach {
            println(it)
        }
    }


    /**
     * 1，使用方法注入，与spring框架进行解耦
     */
    @Test
    fun `lookup method injection`() {

        val context = ClassPathXmlApplicationContext("method/beans.xml")
        context.beanFactory.beanNamesIterator.forEach {
            println(it)
        }
        val bean = context.getBean<cn.yusite.kotlin.spring.framework.chapter.method.lookup.CommandManager>("lookManager")
//        val bean = context.getBean("lookManager", cn.yusite.kotlin.spring.framework.chapter.method.lookup.CommandManager::class.java)
        val mapOf = mapOf("one" to "1")
        bean.process(mapOf)
        bean.process(mapOf)
        bean.process(mapOf)
        println("====".repeat(10))
        context.beanFactory.beanNamesIterator.forEach {
            println(it)
        }
    }
}