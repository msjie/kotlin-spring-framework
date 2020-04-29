package cn.yusite.kotlin.spring.framework.xml.factory

import org.springframework.beans.factory.config.BeanFactoryPostProcessor
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory

/**
 * 参看实现：PropertySourcesPlaceholderConfigurer
 *
 * Customizing Configuration Metadata
 *
 * 主要针对bean配置元数据进行操作（更改），在bean实例化之前
 */
class CustomBeanFactoryPostProcessor : BeanFactoryPostProcessor {

    override fun postProcessBeanFactory(beanFactory: ConfigurableListableBeanFactory) {

        println("bean factory post processor")
    }
}