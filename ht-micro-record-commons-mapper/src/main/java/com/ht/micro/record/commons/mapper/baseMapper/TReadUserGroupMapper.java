package com.ht.micro.record.commons.mapper.baseMapper;

import com.ht.micro.record.commons.domain.TReadUserGroup;
import tk.mybatis.mapper.MyMapper;

import java.util.List;
import java.util.Map;

public interface TReadUserGroupMapper extends MyMapper<TReadUserGroup> {
    List<TReadUserGroup> searchReadUserGroupList(Map<String, Object> params);

}