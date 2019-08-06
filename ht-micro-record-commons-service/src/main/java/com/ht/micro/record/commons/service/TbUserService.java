package com.ht.micro.record.commons.service;


import com.ht.micro.record.commons.domain.TbUser;

public interface TbUserService extends BaseCrudService<TbUser> {

    TbUser getById(long id);
}
