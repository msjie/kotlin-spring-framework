package cn.yusite.kotlin.spring.framework.annotation.qualifer

import cn.yusite.kotlin.spring.framework.annotation.primary.MovieCatalog
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component

@Component
class MovieRecom {

    lateinit var movieCatalog: MovieCatalog

    @Autowired
    fun prepare(@Qualifier(value="secondMovieCatalog") movieCatalog: MovieCatalog) {

        this.movieCatalog = movieCatalog
    }


}