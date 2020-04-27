package cn.yusite.kotlin.spring.framework.chapter.four

import org.springframework.beans.factory.InitializingBean
import org.springframework.context.ApplicationContext
import org.springframework.context.ApplicationContextAware

import org.springframework.beans.factory.getBean

class Y : InitializingBean, ApplicationContextAware {

    private lateinit var x: X

    private lateinit var applicationContext: ApplicationContext


    override fun afterPropertiesSet() {

        this.x = applicationContext.getBean<X>("x")
    }

    override fun setApplicationContext(applicationContext: ApplicationContext) {
        this.applicationContext = applicationContext
    }

    fun hi() {

        x.hi()
    }
}