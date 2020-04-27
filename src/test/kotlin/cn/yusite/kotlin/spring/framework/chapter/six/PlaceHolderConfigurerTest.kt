package cn.yusite.kotlin.spring.framework.chapter.six

import cn.yusite.kotlin.spring.framework.chapter.four.Y
import kotlin.test.Test

import org.springframework.beans.factory.getBean
import org.springframework.context.support.ClassPathXmlApplicationContext

class PlaceHolderConfigurerTest {

    /**
     * 怎么解决spring el表单时，使用指定文件
     */
    @Test
    fun `place holder configurer test`(): Unit {

        val beanFactory = ClassPathXmlApplicationContext("chapter6/beans.xml")
        val bean = beanFactory.getBean<T>("t")
        bean.hi()
    }
}