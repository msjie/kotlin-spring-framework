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
    fun `Test single bean`() {

        val context = ClassPathXmlApplicationContext("chapter1/daos.xml", "chapter1/services.xml")
        val bean2 = context.getBean(PetStoreServiceImpl::class.java)
        val bean1 = context.getBean(PetStoreServiceImpl::class.java)
        println(bean1)
        println(bean1 == bean2)
        assert(bean1 == bean2)
        context.getBean<JpaAccountDao>("accountDao")
    }

    @Test
    fun testGen() {

        val genericApplicationContext = GenericApplicationContext()
        XmlBeanDefinitionReader(genericApplicationContext).loadBeanDefinitions("chapter1/daos.xml")
        genericApplicationContext.refresh()
        val bean = genericApplicationContext.getBean<JpaAccountDao>("accountDao")
        val userDao = genericApplicationContext.getBean<JpaAccountDao>("userDao")
        assert(bean == userDao)
        bean.saveUser("hello")
        println(bean)
        val beanFactory = genericApplicationContext.beanFactory
        val accountDaoDefinition = beanFactory.getBeanDefinition("accountDao")
        println(accountDaoDefinition)
    }

}