package cn.yusite.kotlin.spring.framework.xml.four

/**
 * circular dependence (循环依赖)
 */
class X constructor(y: Y) {

    fun hi() {

        println("hi i am x")
    }
}