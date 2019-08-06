package com.ht.micro.record.commons.service.impl;

import com.ht.micro.record.commons.domain.TDepartment;
import com.ht.micro.record.commons.mapper.baseMapper.TDepartmentMapper;
import com.ht.micro.record.commons.service.TDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TDepartmentServiceImpl implements TDepartmentService {

    @Autowired
    TDepartmentMapper tDepartmentMapper;

    @Override
    public TDepartment getById(long id) {
        return tDepartmentMapper.selectByPrimaryKey(id);
    }



}
