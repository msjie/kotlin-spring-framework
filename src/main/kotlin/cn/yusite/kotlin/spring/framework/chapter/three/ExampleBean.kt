package cn.yusite.kotlin.spring.framework.chapter.three

class ExampleBean {
    private val years: Int // Number of years to calculate the Ultimate Answer
    private val ultimateAnswer: String// The Answer to Life, the Universe, and Everything

    constructor(years: Int, str: String) {
        this.years = years
        this.ultimateAnswer = str
    }
}

fun main(args: Array<String>) {

    var exampleBean = ExampleBean(2, "2")
    //lambda表达式是个对象
    var block: (ExampleBean).() -> String = {
        "test method"
    }
    println(exampleBean.run(block))
}