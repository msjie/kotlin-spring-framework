package cn.yusite.kotlin.spring.framework.chapter.scope

import org.springframework.beans.factory.ObjectFactory
import org.springframework.beans.factory.config.Scope

class CustomScope : Scope {


    override fun resolveContextualObject(key: String): Any? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }



    override fun remove(name: String): Any? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    override fun get(name: String, objectFactory: ObjectFactory<*>): Any {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    override fun registerDestructionCallback(name: String, callback: Runnable) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getConversationId(): String? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}