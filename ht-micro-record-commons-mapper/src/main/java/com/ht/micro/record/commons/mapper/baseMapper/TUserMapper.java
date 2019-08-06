package com.ht.micro.record.commons.mapper.baseMapper;

import com.ht.micro.record.commons.domain.TUser;
import tk.mybatis.mapper.MyMapper;

import java.util.List;
import java.util.Map;

public interface TUserMapper extends MyMapper<TUser> {
    List<TUser> pageList(Map<String, Object> params);

}