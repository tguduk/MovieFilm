package com.turgutguduk.service.test2;

import com.turgutguduk.model.Test3;

import java.util.List;

/**
 * Created by turgut on 19.03.2016.
 */
public interface Test2Service
{

    public Test3 create(Test3 test3);
    public Test3 delete(int id);
    public List<Test3> findAll();
    public Test3 update(Test3 test3);
    public Test3 findById(int id);
}
