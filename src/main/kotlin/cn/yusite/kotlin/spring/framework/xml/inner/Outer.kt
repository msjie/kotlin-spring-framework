package cn.yusite.kotlin.spring.framework.xml.inner

class Outer (val outerName: String){

    lateinit var target: Inner

    fun hi() {

        println("$outerName")
    }

}

class Inner (private val innerName: String) {

    fun hi() {

        println("$innerName")
    }
}