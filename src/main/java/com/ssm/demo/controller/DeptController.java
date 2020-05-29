package com.ssm.demo.controller;

import com.ssm.demo.entity.Dept;
import com.ssm.demo.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    private DeptService deptService;
    @RequestMapping("/getAll")
    public List<Dept> getAll(){
        return deptService.getAll();
    }
}
