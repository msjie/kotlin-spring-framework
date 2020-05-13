package cn.yusite.kotlin.spring.framework.aop.one

import cn.yusite.kotlin.spring.framework.annotation.one.SimpleMovieLister
import cn.yusite.kotlin.spring.framework.annotation.two.MainConfigurer
import cn.yusite.kotlin.spring.framework.annotation.two.pojo.P
import org.junit.Test
import org.springframework.beans.factory.getBean
import org.springframework.context.annotation.AnnotationConfigApplicationContext

class AspectConfigTest {
    @Test
    fun `context annotation config test`() {

        val context = AnnotationConfigApplicationContext(AspectConfig::class.java)
        val bean = context.getBean<CustomService>("customService")
        bean.doService()
        println(bean)

    }
}