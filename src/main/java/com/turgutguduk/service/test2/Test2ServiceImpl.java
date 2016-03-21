package com.turgutguduk.service.test2;

import com.turgutguduk.model.Test3;
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
    public Test3 create(Test3 test3)
    {
        return test2Repository.saveAndFlush(test3);
    }

    @Override
    @Transactional
    public Test3 delete(int id) {
        return null;
    }

    @Override
    @Transactional
    public List<Test3> findAll() {
        return test2Repository.findAll();
    }

    @Override
    @Transactional
    public Test3 update(Test3 test3) {
        return test2Repository.save(test3);
    }

    @Override
    @Transactional
    public Test3 findById(int id) {
        return test2Repository.findOne(id);
    }
}
