package cn.yusite.kotlin.spring.framework.xml.three

/**
 * 基于setter方法的di注入
 */
class ThingFour {
    lateinit var thingOne: ThingOne
    lateinit var thingTwo: ThingTwo
    var i: Int = 1

    fun hi(): Unit {

        println("""
            $thingOne             
            $thingTwo             
            $i             
        """.trimIndent())
    }
}