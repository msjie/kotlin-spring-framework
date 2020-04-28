package cn.yusite.kotlin.spring.framework.xml.one.service

import cn.yusite.kotlin.spring.framework.xml.one.dao.JpaAccountDao
import cn.yusite.kotlin.spring.framework.xml.one.dao.JpaItemDao

class PetStoreServiceImpl {

    lateinit var itemDao: JpaItemDao

    lateinit var accountDao: JpaAccountDao

}