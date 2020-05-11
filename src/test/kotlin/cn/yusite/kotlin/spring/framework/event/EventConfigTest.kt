package cn.yusite.kotlin.spring.framework.event

import org.junit.Test
import org.springframework.context.annotation.AnnotationConfigApplicationContext

class EventConfigTest {

    @Test
    fun event() {

        val context = AnnotationConfigApplicationContext(EventConfig::class.java)

    }
}