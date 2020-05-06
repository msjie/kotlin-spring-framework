package cn.yusite.kotlin.spring.framework.annotation.resource

import org.springframework.context.ApplicationContext
import javax.annotation.Resource

class R {

    @Resource
    lateinit var context: ApplicationContext
}