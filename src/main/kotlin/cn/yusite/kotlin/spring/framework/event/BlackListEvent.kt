package cn.yusite.kotlin.spring.framework.event

import org.springframework.context.ApplicationEvent

class BlackListEvent constructor(any: Any) : ApplicationEvent(any) {
}