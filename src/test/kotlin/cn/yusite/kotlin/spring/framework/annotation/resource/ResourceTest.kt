package cn.yusite.kotlin.spring.framework.annotation.one

import cn.yusite.kotlin.spring.framework.annotation.resource.R
import org.junit.Test
import org.springframework.beans.factory.getBean
import org.springframework.context.support.ClassPathXmlApplicationContext
import kotlin.test.assertSame

/**
 *
 */
class ResourceTest {

    @Test
    fun `context annotation config test`() {

        val context = ClassPathXmlApplicationContext("annotation/resource/beans.xml")
        val bean = context.getBean<R>("r")
        assertSame(bean.context, context, null)
    }
}