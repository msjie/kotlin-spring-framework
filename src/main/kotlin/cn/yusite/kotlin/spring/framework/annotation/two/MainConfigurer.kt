package cn.yusite.kotlin.spring.framework.annotation.two

import cn.yusite.kotlin.spring.framework.annotation.two.pojo.O
import cn.yusite.kotlin.spring.framework.annotation.two.pojo.P
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.ImportResource
import org.springframework.context.annotation.Primary

/**
 * code injection java bean
 */
@ImportResource("classpath:annotation/one/beans.xml")
@Configuration
class MainConfigurer {

    /**
     * bean factory
     */
    @Bean
    @Primary
    fun o(): O {

        return O()
    }

    @Bean
    fun oSecond(): O {

        return O()
    }

    @Bean
    fun p(o: O): P {

        return P(o)
    }
}