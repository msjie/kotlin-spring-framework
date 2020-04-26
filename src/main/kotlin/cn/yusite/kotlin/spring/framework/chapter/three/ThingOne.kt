package cn.yusite.kotlin.spring.framework.chapter.three

class ThingOne constructor(private val thingTwo: ThingTwo, private val thingThree: ThingThree) {

    fun hi(): Unit {

        println("thingTwo ----$thingTwo")
        println("thingThree -----$thingThree")
    }
}