package com.ht.micro.record.user.service;


import com.ht.micro.record.commons.domain.TbUser;
import com.ht.micro.record.commons.service.BaseCrudService;


public interface TbUserService extends BaseCrudService<TbUser> {

    TbUser getById(long id);
    TbUser updateUser(TbUser userInfo);
    void deleteUser(long id);
}
