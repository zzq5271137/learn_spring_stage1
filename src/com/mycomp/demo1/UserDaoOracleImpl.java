package com.mycomp.demo1;

public class UserDaoOracleImpl implements IUserDao {

    @Override
    public void save() {
        System.out.println("Oracle--save...");
    }

    @Override
    public void delete() {
        System.out.println("Oracle--delete...");
    }
}
