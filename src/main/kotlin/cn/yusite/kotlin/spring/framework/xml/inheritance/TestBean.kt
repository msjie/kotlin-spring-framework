package cn.yusite.kotlin.spring.framework.xml.inheritance

/**
 * 抽象类不会被spring初始化，除非bean定义中没有声明是抽象类
 *
 * 抽象类相当于模板
 *
 */
abstract class TestBean {

    lateinit var name: String

    lateinit var age: String

}