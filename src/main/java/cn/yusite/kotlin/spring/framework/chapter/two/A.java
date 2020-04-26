package cn.yusite.kotlin.spring.framework.chapter.two;

public class A {

    public static void main(String[] args) {

        StaticFactory instance1 = StaticFactory.Companion.createInstance();
        StaticFactory instance2 = StaticFactory.Companion.createInstance();
        System.out.println(instance1 == instance2);
    }
}
