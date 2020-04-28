package cn.yusite.kotlin.spring.framework.xml.factory

import org.springframework.beans.factory.config.BeanFactoryPostProcessor
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory

/**
 * Customizing Configuration Metadata
 */
class CustomBeanFactoryPostProcessor : BeanFactoryPostProcessor {

    override fun postProcessBeanFactory(beanFactory: ConfigurableListableBeanFactory) {

        println("bean factory post processor")
    }
}