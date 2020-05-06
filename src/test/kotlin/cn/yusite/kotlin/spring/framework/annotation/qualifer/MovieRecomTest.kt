package cn.yusite.kotlin.spring.framework.annotation.qualifer

import cn.yusite.kotlin.spring.framework.annotation.primary.MovieConfiguration
import cn.yusite.kotlin.spring.framework.annotation.primary.MovieRecommender
import org.junit.Assert.*
import org.junit.Test
import org.springframework.context.annotation.AnnotationConfigApplicationContext

class MovieRecomTest {

    @Test
    fun test() {

        val annotationConfigApplicationContext = AnnotationConfigApplicationContext(MovieConfiguration::class.java,
                MovieRecom::class.java)
        var bean = annotationConfigApplicationContext.getBean(MovieRecom::class.java)
        kotlin.test.assertEquals(bean.movieCatalog.sayHi(), "i am second", null)
    }
}