package cn.yusite.kotlin.spring.framework.chapter.three

class ExampleBean {
    private val years: Int // Number of years to calculate the Ultimate Answer
    private val ultimateAnswer: String// The Answer to Life, the Universe, and Everything

    constructor(thingOne: ThingOne) {
        years = 10
        ultimateAnswer = "10"
    }

    constructor(years: Int, str: String) {
        this.years = years
        this.ultimateAnswer = str
    }

    fun hi(): Unit {

        println("years: $years;ultimateAnswer:$ultimateAnswer")
    }

    companion object {

        @JvmStatic
        fun createInstance(years: Int, str: String): ExampleBean {

            return ExampleBean(years,str)
        }
    }
}

fun main(args: Array<String>) {

    var exampleBean = ExampleBean(2, "2")
    //lambda表达式是个对象
    var block: (ExampleBean).() -> String = {
        "test method"
    }
    println(exampleBean.run(block))

    var exampleBean1 = ExampleBean(ThingOne(ThingTwo(), ThingThree()))
    exampleBean1.hi()
}