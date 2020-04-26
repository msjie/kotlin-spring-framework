package cn.yusite.kotlin.spring.framework.chapter.two

class StaticFactory private constructor(){

    companion object {

        var staticFactory = StaticFactory()

        fun createInstance(): StaticFactory = staticFactory
    }
}

//fun StaticFactory.Companion.createStaticFactory() = StaticFactory()

fun main(args: Array<String>) {

    var createInstance = StaticFactory.createInstance()
}