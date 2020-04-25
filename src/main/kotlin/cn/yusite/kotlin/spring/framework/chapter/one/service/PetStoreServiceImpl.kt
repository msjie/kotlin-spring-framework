package cn.yusite.kotlin.spring.framework.chapter.one.service

import cn.yusite.kotlin.spring.framework.chapter.one.dao.JpaAccountDao
import cn.yusite.kotlin.spring.framework.chapter.one.dao.JpaItemDao

class PetStoreServiceImpl {

    lateinit var itemDao: JpaItemDao

    lateinit var accountDao: JpaAccountDao

}