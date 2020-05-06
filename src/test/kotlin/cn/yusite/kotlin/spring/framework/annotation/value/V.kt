package cn.yusite.kotlin.spring.framework.annotation.value

import org.springframework.beans.factory.annotation.Value

class V constructor(@Value("v.name") name: String) {

    private val name: String = name
}