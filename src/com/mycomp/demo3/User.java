package com.mycomp.demo3;

public class User {

    public User() {
        super();
        System.out.println("默认的构造方法");
    }

    public static User createUser() {
        System.out.println("静态工厂实例化");
        return new User();
    }
}
