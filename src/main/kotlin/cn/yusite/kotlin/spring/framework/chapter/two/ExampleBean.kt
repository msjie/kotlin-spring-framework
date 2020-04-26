package cn.yusite.kotlin.spring.framework.chapter.two

class ExampleBean {

    companion object {
        var exampleAnotherBean = ExampleAnotherBean()
    }

    fun createExampleAnotherBean(): ExampleAnotherBean = exampleAnotherBean

}