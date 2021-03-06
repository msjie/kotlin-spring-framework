package cn.yusite.kotlin.spring.framework.xml.two

class StaticFactory private constructor(){

    companion object {

        var staticFactory = StaticFactory()

        @JvmStatic
        fun createInstance(): StaticFactory = staticFactory
    }
}

//fun StaticFactory.Companion.createStaticFactory() = StaticFactory()

fun main(args: Array<String>) {

    var createInstance = StaticFactory.createInstance()
}