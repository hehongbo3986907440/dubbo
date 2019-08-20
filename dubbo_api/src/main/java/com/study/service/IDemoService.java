package com.study.service;

import com.study.common.entity.Org;
import com.study.common.entity.UserBase;
import jdk.nashorn.internal.runtime.UserAccessorProperty;

import java.util.List;

public interface IDemoService {
    String getMess();

    UserBase getUser(String name);

    List<UserBase> getUsers();

    int addUser(UserBase user);

    int delUser(String id);

    int updateUser(UserBase user);

    Org getOrg(String name);

    List<Org> getOrgs();
}
