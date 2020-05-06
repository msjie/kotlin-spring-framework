package cn.yusite.kotlin.spring.framework.annotation.resource

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource

@PropertySource("classpath:jdbc.properties")
@Configuration
class RConfig