package cn.yusite.kotlin.spring.framework.spel

import org.springframework.expression.spel.standard.SpelExpressionParser

fun main() {

    val spelExpressionParser = SpelExpressionParser()
    val exp = spelExpressionParser.parseExpression("'Hello World'.concat('!')")
    var s = exp.value as String
    println(s)
}