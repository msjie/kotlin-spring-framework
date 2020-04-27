package cn.yusite.kotlin.spring.framework.chapter.four

import org.springframework.context.annotation.Lazy

/**
 * circular dependence (循环依赖)
 */
class X constructor(y: Y) {

    fun hi() {

        println("hi i am x")
    }
}