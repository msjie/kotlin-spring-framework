package cn.yusite.kotlin.spring.framework.proxy;

import lombok.Data;

@Data
public class TestLombok {

    public TestLombok(String name) {

        this.name = name;
    }

    private String name;

}
