package cn.yusite.kotlin.spring.framework.xml.lifecycle

import org.springframework.context.Lifecycle

/**
 *
 */
class CustomLifecycle : Lifecycle {

    override fun isRunning(): Boolean {

        println("isRunning")
        return false;
    }

    override fun start() {

        println("start")
    }

    override fun stop() {

        println("stop")
    }
}