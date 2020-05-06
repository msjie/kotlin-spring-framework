package cn.yusite.kotlin.spring.framework.annotation.primary

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary

/**
 * ComponentScan
 * 开启组件扫描
 */
@Configuration
@ComponentScan
class MovieConfiguration {

    /**
     * 优先级高，
     */
    @Bean
    @Primary
    fun firstMovieCatalog(): MovieCatalog {

        return MovieCatalog("first")
    }

    @Bean
    fun secondMovieCatalog(): MovieCatalog {

        return MovieCatalog("second")
    }

}