package cn.yusite.kotlin.spring.framework.chapter.six

class T private constructor(x: String) {

    val x: String = x

    fun hi(): Unit {

        println(x)
    }
}