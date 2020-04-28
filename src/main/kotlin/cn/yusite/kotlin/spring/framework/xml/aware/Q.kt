package cn.yusite.kotlin.spring.framework.xml.aware

import org.springframework.context.ApplicationContext
import org.springframework.context.ApplicationContextAware

/**
 * aware 接口
 */
class Q : ApplicationContextAware {

    private lateinit var applicationContext: ApplicationContext

    override fun setApplicationContext(applicationContext: ApplicationContext) {

        this.applicationContext = applicationContext
    }

    fun hi(): Unit {

        applicationContext.beanDefinitionNames.iterator().forEach {
            println(it)
        }
    }
}