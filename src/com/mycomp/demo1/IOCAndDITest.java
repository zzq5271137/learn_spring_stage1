package com.mycomp.demo1;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * IOC: Inversion of Control(控制反转)
 * 控制反转：将对象的创建权反转给（交给）Spring。
 *
 * 业务和实现类过于紧密，底层业务要修改源代码
 * 通过工厂可以实现，接口与实现业务的分离
 * 在工厂内部使用配置文件加载
 *
 * 使用IOC可以代替手写的工厂, 只需要修改applicationContext.xml配置文件
 *
 * DI: 依赖注入
 * 前提必须有IOC的环境
 * Spring管理这个类的时候才能将类的依赖的属性值注入（设置）进来
 * 依赖注入:给spring管理类当中依赖的属性,通过配置文件进行赋值的过程
 */

public class IOCAndDITest {

    @Test
    public void test1() {
        // 1. 加载applicationContext.xml配置文件
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 2. 根据id(配置文件中的bean标签的id属性)获取对象
        // 当加载配置文件的时候就已经把对象创建好了(属性也注入好了)
        IUserDao userDao = (IUserDao) applicationContext.getBean("userDao");
        userDao.save();
        userDao.delete();
    }

    @Test
    public void test2() {
        // 使用传统的方式给属性赋值
        UserDaoMysqlImpl userDaoMysql = new UserDaoMysqlImpl();
        userDaoMysql.setName("MysqlDao");
        System.out.println(userDaoMysql.getName());

        // 通过DI(依赖注入)的方式给属性赋值, 必须要有IOC环境(该类已经被spring管理)
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserDao userDao = (IUserDao) applicationContext.getBean("userDao");
        System.out.println(((UserDaoMysqlImpl) userDao).getName());
    }

    @Test
    public void test3() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 默认, spring创建的对象是单例的(每次获取, 地址都是同一个)
        IUserDao userDao1 = (IUserDao) applicationContext.getBean("userDao");
        System.out.println(userDao1);
        IUserDao userDao2 = (IUserDao) applicationContext.getBean("userDao");
        System.out.println(userDao2);
    }
}
