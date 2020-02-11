package com.mycomp.demo3;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * 工厂实例化的方式:
 * 1. 调用无参构造方法-默认
 * 2. 静态工厂实例化
 * 3. 实例工厂实例化
 */

public class PersonTest {

    @Test
    public void test() {
        // 分模块配置:
        // 方式一: 加载多个配置文件 (一般不这么用)
        // ClassPathXmlApplicationContext applicationContext =
        // new ClassPathXmlApplicationContext("applicationContext.xml", "applicationContext_zzq.xml");
        // 方式二: 在核心配置文件applicationContext.xml中导入其他的配置文件(详见applicationContext.xml)
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) applicationContext.getBean("user");
        System.out.println(user);

        System.out.println("==============");

        // 实例工厂实例化
        User user2 = (User) applicationContext.getBean("user2");
        System.out.println("实例工厂实例化:");
        System.out.println(user2);
    }

}
