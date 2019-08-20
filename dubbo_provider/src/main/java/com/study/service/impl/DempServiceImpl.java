package com.study.service.impl;

import com.study.common.entity.Org;
import com.study.common.entity.UserBase;
import com.study.service.IDemoService;

import java.util.ArrayList;
import java.util.List;

public class DempServiceImpl implements IDemoService {
    public String getMess() {
        return "hello dubbo";
    }

    public UserBase getUser(String name) {
        UserBase user = new UserBase();
        user.setName("hhb");
        user.setAge(18);
        user.setId("12233344565677");
        return user;
    }

    public List<UserBase> getUsers() {
        List<UserBase> users = new ArrayList<UserBase>();
        UserBase user = new UserBase();
        user.setName("hhb");
        user.setAge(18);
        user.setId("12233344565677");
        users.add(user);
        UserBase user2 = new UserBase();
        user2.setName("hhb1");
        user2.setAge(18);
        user2.setId("1111111111111111");
        users.add(user2);
        return users;
    }

    public int addUser(UserBase user) {
        return 0;
    }

    public int delUser(String id) {
        return 0;
    }

    public int updateUser(UserBase user) {
        return 0;
    }

    public Org getOrg(String name) {
        return null;
    }

    public List<Org> getOrgs() {
        return null;
    }
}
