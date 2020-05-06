package cn.yusite.kotlin.spring.framework.annotation.two

import cn.yusite.kotlin.spring.framework.annotation.one.SimpleMovieLister
import cn.yusite.kotlin.spring.framework.annotation.two.pojo.P
import org.junit.Test
import org.springframework.beans.factory.getBean
import org.springframework.context.annotation.AnnotationConfigApplicationContext

class MainConfigurerTest {

    @Test
    fun `context annotation config test`() {

        val context = AnnotationConfigApplicationContext(MainConfigurer::class.java)
        val bean = context.getBean<SimpleMovieLister>("simpleMovieLister")
        println(bean)

        val p = context.getBean(P::class.java)
        p.hi()
    }
}