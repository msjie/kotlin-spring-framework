package cn.yusite.kotlin.spring.framework.annotation.one

import org.springframework.beans.factory.annotation.Autowired

class SimpleMovieLister {

    @Autowired
    lateinit var movieFinder: MovieFinder

    @Autowired
    lateinit var movieFinders: Array<MovieFinder>

    @Autowired
    lateinit var movieFinderMap : Map<String, MovieFinder>
}