package com.ht.micro.record.commons.mapper.baseMapper;

import com.ht.micro.record.commons.domain.TReadUser;
import tk.mybatis.mapper.MyMapper;

import java.util.List;
import java.util.Map;

public interface TReadUserMapper extends MyMapper<TReadUser> {
    List<TReadUser> searchReadUserList(Map<String, Object> params);

}