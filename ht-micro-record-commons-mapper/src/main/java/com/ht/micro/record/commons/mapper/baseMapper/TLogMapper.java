package com.ht.micro.record.commons.mapper.baseMapper;

import com.ht.micro.record.commons.domain.TLog;
import tk.mybatis.mapper.MyMapper;

import java.util.List;
import java.util.Map;

public interface TLogMapper extends MyMapper<TLog> {
    List<TLog> searchLogList(Map<String, Object> params);

}