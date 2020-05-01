package cn.yusite.kotlin.spring.framework.annotation.one

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.ApplicationContext

class SimpleMovieLister {

    @Autowired
    lateinit var movieFinder: MovieFinder

    @Autowired
    lateinit var movieFinders: Array<MovieFinder>

    @Autowired
    lateinit var movieFinderMap : Map<String, MovieFinder>

    @Autowired
    lateinit var context: ApplicationContext
}