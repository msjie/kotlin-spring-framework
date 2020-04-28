package cn.yusite.kotlin.spring.framework.chapter.method

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