package cn.yusite.kotlin.spring.framework.aop.one

import lombok.extern.log4j.Log4j2
import org.springframework.stereotype.Service

@Log4j2
@Service
class CustomService {

    fun doService(){

        println("doService method")
    }
}