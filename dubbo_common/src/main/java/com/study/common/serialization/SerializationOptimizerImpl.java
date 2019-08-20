package com.study.common.serialization;

import com.alibaba.dubbo.common.serialize.support.SerializationOptimizer;
import com.study.common.entity.Org;
import com.study.common.entity.UserBase;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class SerializationOptimizerImpl implements SerializationOptimizer {
    public Collection<Class> getSerializableClasses() {
//        List<Class> list = new LinkedList<Class>();
//        list.add(UserBase.class);
//        list.add(Org.class);
        return null;
    }
}
