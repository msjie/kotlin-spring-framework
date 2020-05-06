package cn.yusite.kotlin.spring.framework.annotation.primary

import org.junit.Test
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import kotlin.test.assertEquals

class MovieConfigurationTest {

    @Test
    fun firstTest() {

        val annotationConfigApplicationContext = AnnotationConfigApplicationContext(MovieConfiguration::class.java)
        var bean = annotationConfigApplicationContext.getBean(MovieRecommender::class.java)
        assertEquals(bean.movieCatalog.sayHi(),"i am first",null)
    }
}