package cn.yusite.kotlin.spring.framework.chapter.six

import org.apache.commons.dbcp2.BasicDataSource
import java.sql.Connection

class T private constructor(x: String) {

    val x: String = x

    var basicDataSource: BasicDataSource? = null

    fun hi(): Unit {

        println(x)
    }

    fun getConnection(): Connection? {

        return basicDataSource?.connection
    }
}