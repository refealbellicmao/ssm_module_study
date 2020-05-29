package com.ssm.demo.service;

import com.ssm.demo.entity.Dept;
import com.ssm.demo.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("deptService")
public class DeptServiceImpl implements DeptService{
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> getAll() {
        return deptMapper.getAll();
    }
}
