package cn.yusite.kotlin.spring.framework.xml.two

class ExampleBean {

    companion object {
        var exampleAnotherBean = ExampleAnotherBean(0)
    }


    fun createExampleAnotherBean(): ExampleAnotherBean = exampleAnotherBean

    fun createExampleAnotherBean(age: Int): ExampleAnotherBean {
        exampleAnotherBean.age = age
        return exampleAnotherBean
    }

}