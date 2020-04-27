package cn.yusite.kotlin.spring.framework.chapter.six

import cn.yusite.kotlin.spring.framework.chapter.four.Y
import kotlin.test.Test

import org.springframework.beans.factory.getBean
import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext

class PlaceHolderConfigurerTest {

    /**
     * 1：父子容器
     *
     * 2：使用属性占位符
     */
    @Test
    fun `place holder configurer test`(): Unit {

        val parentBeanFactory = ClassPathXmlApplicationContext("chapter5/beans.xml")
        if (parentBeanFactory is ApplicationContext) {
            val beanFactory = ClassPathXmlApplicationContext(arrayOf("chapter6/beans.xml"), true, parentBeanFactory)
            beanFactory.parent = parentBeanFactory
            val bean = beanFactory.getBean<T>("t")
            bean.hi()
            println(bean.getConnection())
        }

    }
}