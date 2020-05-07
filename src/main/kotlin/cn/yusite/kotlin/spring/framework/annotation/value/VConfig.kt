package cn.yusite.kotlin.spring.framework.annotation.value

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource

@PropertySource("classpath:jdbc.properties")
@Configuration
class VConfig
