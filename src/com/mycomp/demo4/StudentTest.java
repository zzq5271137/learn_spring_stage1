package com.mycomp.demo4;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class StudentTest {

    @Test
    public void test() {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student = (Student) applicationContext.getBean("student");
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.myDogName);

        System.out.println(student.dog.dogname);
        System.out.println(student.dog.dogage);
        System.out.println(student.dog.dogcolor);

        System.out.println("数组: " + Arrays.toString(student.myArr));
        System.out.println("List: " + student.myList);
        System.out.println("Set: " + student.mySet);
        System.out.println("Map: " + student.myMap);
    }

}
