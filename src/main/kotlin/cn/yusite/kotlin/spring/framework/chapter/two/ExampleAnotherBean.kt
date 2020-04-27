package cn.yusite.kotlin.spring.framework.chapter.two

class ExampleAnotherBean constructor(age: Int){

    var age :Int = age

    fun hi(): Unit {
        println("age: $age")
    }

}