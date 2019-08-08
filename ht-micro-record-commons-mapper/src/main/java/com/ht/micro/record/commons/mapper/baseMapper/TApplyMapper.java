package com.ht.micro.record.commons.mapper.baseMapper;

import com.ht.micro.record.commons.domain.TApply;
import tk.mybatis.mapper.MyMapper;

import java.util.List;
import java.util.Map;

public interface TApplyMapper extends MyMapper<TApply> {
    List<TApply> searchApplyList(Map<String, Object> map);

    List<TApply> getByAskedName(String name);
}