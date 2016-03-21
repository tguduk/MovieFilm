package com.turgutguduk.service.test2;

import com.turgutguduk.model.test2.Test2;

import java.util.List;

/**
 * Created by turgut on 19.03.2016.
 */
public interface Test2Service
{

    public Test2 create(Test2 test2);
    public Test2 delete(int id);
    public List<Test2> findAll();
    public Test2 update(Test2 test2);
    public Test2 findById(int id);
}
