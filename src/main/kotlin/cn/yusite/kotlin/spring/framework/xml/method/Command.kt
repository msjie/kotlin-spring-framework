package cn.yusite.kotlin.spring.framework.xml.method

/**
 * prototype bean
 */
class Command {

    lateinit var state: Map<String, Any>

    fun execute() {

        println("""
            $this
            $state
        """.trimIndent())
    }
}