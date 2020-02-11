package com.mycomp.demo1;

public class UserDaoMysqlImpl implements IUserDao {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void save() {
        System.out.println("Mysql--save...");
    }

    @Override
    public void delete() {
        System.out.println("Mysql--delete...");
    }
}
