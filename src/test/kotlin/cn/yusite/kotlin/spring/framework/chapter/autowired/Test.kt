package cn.yusite.kotlin.spring.framework.chapter.autowired

import cn.yusite.kotlin.spring.framework.chapter.aotuwired.Y
import org.springframework.beans.factory.getBean
import org.springframework.context.support.ClassPathXmlApplicationContext
import kotlin.test.Test

class AutowiredTest {

    /**
     * 1，自动装配
     */
    @Test
    fun `autowired test`() {

        val context = ClassPathXmlApplicationContext("autowired/beans.xml")
        context.beanFactory.beanNamesIterator.forEach {
            println(it)
        }
        val bean: Y = context.getBean<Y>("y")
        bean.x.hi()
        println("z value : ${bean.z}")
        println("====".repeat(10))
        context.beanFactory.beanNamesIterator.forEach {
            println(it)
        }
    }
}