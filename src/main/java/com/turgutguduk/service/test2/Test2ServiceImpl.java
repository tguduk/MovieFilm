package com.turgutguduk.service.test2;

import com.turgutguduk.model.test2.Test2;
import com.turgutguduk.repository.test2.Test2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by turgut on 19.03.2016.
 */
public class Test2ServiceImpl implements  Test2Service
{
    @Autowired
    Test2Repository test2Repository;

    @Override
    @Transactional
    public Test2 create(Test2 test2)
    {
        return test2Repository.saveAndFlush(test2);
    }

    @Override
    @Transactional
    public Test2 delete(int id) {
        return null;
    }

    @Override
    @Transactional
    public List<Test2> findAll() {
        return test2Repository.findAll();
    }

    @Override
    @Transactional
    public Test2 update(Test2 test2) {
        return test2Repository.save(test2);
    }

    @Override
    @Transactional
    public Test2 findById(int id) {
        return test2Repository.findOne(id);
    }
}
