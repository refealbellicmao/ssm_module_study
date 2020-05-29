package com.ssm.demo.mapper;

import com.ssm.demo.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMapper {
    public List<Dept> getAll();
}
