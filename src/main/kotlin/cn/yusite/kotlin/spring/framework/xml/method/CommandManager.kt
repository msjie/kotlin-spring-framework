package cn.yusite.kotlin.spring.framework.xml.method

import org.springframework.context.ApplicationContext
import org.springframework.context.ApplicationContextAware

class CommandManager : ApplicationContextAware {

    private lateinit var applicationContext: ApplicationContext

    override fun setApplicationContext(applicationContext: ApplicationContext) {

        this.applicationContext = applicationContext
    }

    fun process(map: Map<String,Any>) {

        var command: Command = createCommand()
        command.state = map
        return command.execute()
    }

    private fun createCommand(): Command = applicationContext.getBean("command",Command::class.java)

}