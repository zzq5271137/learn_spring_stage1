package com.mycomp.demo4;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

    public String name;
    public Integer age;
    public Dog dog;
    public String myDogName;
    public String[] myArr;
    public List<Integer> myList;
    public Set<Integer> mySet;
    public Map<Integer, String> myMap;

    public Student() {
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void setMyMap(Map<Integer, String> myMap) {
        this.myMap = myMap;
    }

    public void setMySet(Set<Integer> mySet) {
        this.mySet = mySet;
    }

    public void setMyList(List<Integer> myList) {
        this.myList = myList;
    }

    public void setMyArr(String[] myArr) {
        this.myArr = myArr;
    }

    public void setMyDogName(String myDogName) {
        this.myDogName = myDogName;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
