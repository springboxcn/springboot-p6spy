package edu.maskleo.demo1.service.impl;

import edu.maskleo.demo1.domain.Test;
import edu.maskleo.demo1.mapper.TestMapper;
import edu.maskleo.demo1.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public void add(Test test) {
        testMapper.add(test);
    }

    @Override
    public int modify(Test test) {
        return testMapper.modify(test);
    }

    @Override
    public int delete(Integer id) {
        return testMapper.delete(id);
    }

    @Override
    public Test selectOne(Integer id) {
        return testMapper.selectOne(id);
    }

    @Override
    public List<Test> selectAll() {
        return testMapper.selectAll();
    }
}
