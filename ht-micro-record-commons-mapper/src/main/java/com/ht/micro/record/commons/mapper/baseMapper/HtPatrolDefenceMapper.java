package com.ht.micro.record.commons.mapper.baseMapper;

import com.ht.micro.record.commons.domain.HtPatrolDefence;
import tk.mybatis.mapper.MyMapper;

public interface HtPatrolDefenceMapper extends MyMapper<HtPatrolDefence> {
    String  patrolDefenceMaxCode();

}