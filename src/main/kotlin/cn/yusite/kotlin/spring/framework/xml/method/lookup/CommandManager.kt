package cn.yusite.kotlin.spring.framework.xml.method.lookup

import cn.yusite.kotlin.spring.framework.xml.method.Command

abstract class CommandManager {

    fun process(map: Map<String,Any>) {

        var command: Command = createCommand()
        command.state = map
        return command.execute()
    }

    abstract fun createCommand(): Command
}