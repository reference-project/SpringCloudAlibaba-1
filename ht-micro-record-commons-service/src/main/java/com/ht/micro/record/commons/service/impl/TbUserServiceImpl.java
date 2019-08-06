package com.ht.micro.record.commons.service.impl;

import com.ht.micro.record.commons.domain.TbUser;
import com.ht.micro.record.commons.mapper.baseMapper.TbUserMapper;
import com.ht.micro.record.commons.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TbUserServiceImpl extends BaseCrudServiceImpl<TbUser, TbUserMapper> implements TbUserService {

    @Autowired
    private TbUserMapper tbUserMapper;

    public TbUser getById(long id){
        return tbUserMapper.selectByPrimaryKey(id);
    }

}