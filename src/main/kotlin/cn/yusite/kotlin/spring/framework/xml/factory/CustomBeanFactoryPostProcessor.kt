package cn.yusite.kotlin.spring.framework.xml.factory

import org.springframework.beans.factory.config.BeanFactoryPostProcessor
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory

/**
 * 参看实现：PropertySourcesPlaceholderConfigurer
 *
 * Customizing Configuration Metadata
 */
class CustomBeanFactoryPostProcessor : BeanFactoryPostProcessor {

    override fun postProcessBeanFactory(beanFactory: ConfigurableListableBeanFactory) {

        println("bean factory post processor")
    }
}