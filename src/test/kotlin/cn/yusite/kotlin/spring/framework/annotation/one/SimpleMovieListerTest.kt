package cn.yusite.kotlin.spring.framework.annotation.one

import org.junit.Test
import org.springframework.beans.factory.getBean
import org.springframework.context.support.ClassPathXmlApplicationContext

/**
 *
 * 在@Autowired，@Inject，@Value，和@Resource注释由Spring处理 BeanPostProcessor实现。
 * 这意味着您不能在自己的类型BeanPostProcessor或BeanFactoryPostProcessor类型（如果有）中应用这些注释。
 * 这些类型必须使用XML或Spring @Bean方法显式地“连接”
 */
class SimpleMovieListerTest {

    @Test
    fun `context annotation config test`() {

        val context = ClassPathXmlApplicationContext("annotation/one/beans.xml")
        val bean = context.getBean<SimpleMovieLister>("simpleMovieLister")
        bean.movieFinder.hi()
        println("===".repeat(10))
        bean.movieFinders.iterator().forEach {
            println(it.name)
        }
        println("===".repeat(10))

        for ((k,v) in bean.movieFinderMap) {
            println("$k : $v")
        }
        println("===".repeat(10))
        println(bean.context.getBean<SimpleMovieLister>(MovieFinder::class.java) == bean)
    }
}