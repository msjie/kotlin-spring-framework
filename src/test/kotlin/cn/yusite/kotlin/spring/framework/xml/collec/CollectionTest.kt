package cn.yusite.kotlin.spring.framework.xml.collec

import cn.yusite.kotlin.spring.framework.xml.collection.CollectionExample
import org.junit.Test
import org.springframework.beans.factory.getBean
import org.springframework.context.support.ClassPathXmlApplicationContext

class CollectionTest {

    /**
     * 1：内部bean
     */
    @Test
    fun `inner bean test`() {

        val context = ClassPathXmlApplicationContext("collec/beans.xml")
        val bean = context.getBean<CollectionExample>("collectionExample")
        bean.hi();
        println("===".repeat(10))
        val child = context.getBean<CollectionExample>("child")
        child.hi();
    }
}