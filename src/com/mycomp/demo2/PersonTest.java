package com.mycomp.demo2;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

    @Test
    public void test() {
        // 加载核心配置文件, 会自动直接创建对象(而且是单例的), 并将属性注入
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person.name);

        // 关闭工厂, 里边所有的对象都会销毁(使用单例的情况), 会自动执行所有对象的destroy-method
        applicationContext.close();
    }

}
