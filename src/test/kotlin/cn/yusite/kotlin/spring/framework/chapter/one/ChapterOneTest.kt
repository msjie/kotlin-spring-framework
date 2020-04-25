package cn.yusite.kotlin.spring.framework.chapter.one

import cn.yusite.kotlin.spring.framework.chapter.one.dao.JpaAccountDao
import cn.yusite.kotlin.spring.framework.chapter.one.service.PetStoreServiceImpl
import org.junit.Test
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader
import org.springframework.context.support.ClassPathXmlApplicationContext
import org.springframework.context.support.GenericApplicationContext

import org.springframework.beans.factory.getBean

class ChapterOneTest {

    @Test
    fun `Test single bean`(): Unit {

        var context = ClassPathXmlApplicationContext("chapter1/daos.xml","chapter1/services.xml")
        var bean2 = context.getBean(PetStoreServiceImpl::class.java)
        var bean1 = context.getBean(PetStoreServiceImpl::class.java)
        println(bean1)
        println(bean1 == bean2)
        assert(bean1 == bean2)
        var bean = context.getBean<JpaAccountDao>("accountDao")
    }

    @Test
    fun testGen(): Unit {

        var genericApplicationContext = GenericApplicationContext()
        XmlBeanDefinitionReader(genericApplicationContext).loadBeanDefinitions("chapter1/daos.xml")
        genericApplicationContext.refresh()
        var bean = genericApplicationContext.getBean<JpaAccountDao>("accountDao")
        var userDao = genericApplicationContext.getBean<JpaAccountDao>("userDao")
        assert(bean == userDao)
        bean.saveUser("hello")
        println(bean)
        var beanFactory = genericApplicationContext.beanFactory
        var accountDaoDefinition = beanFactory.getBeanDefinition("accountDao")
        println(accountDaoDefinition)
    }

}