package com.ht.micro.record.commons.mapper.baseMapper;

import com.ht.micro.record.commons.domain.HtInsideAddr;
import tk.mybatis.mapper.MyMapper;

import java.util.List;
import java.util.Map;

public interface HtInsideAddrMapper extends MyMapper<HtInsideAddr> {
    Integer communityMaxCode(Map<String, Object> params);

    Integer maxId();

    List<HtInsideAddr> selectByNameAlias(Map<String, Object> params);

    List<HtInsideAddr> selectByKey(Map<String, Object> params);
}