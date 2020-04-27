package cn.yusite.kotlin.spring.framework.chapter.collection

import java.util.*

class CollectionExample {
    lateinit var properties: Properties
    lateinit var list: List<Any>
    lateinit var set: Set<Any>
    lateinit var map: Map<String, Any>

    fun hi() {
        println("""
            $properties
            $list
            $set
            $map
        """.trimIndent())
    }
}
