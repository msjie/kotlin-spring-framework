package cn.yusite.kotlin.spring.framework.annotation.primary

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class MovieRecommender {

    @Autowired
    lateinit var movieCatalog: MovieCatalog


}