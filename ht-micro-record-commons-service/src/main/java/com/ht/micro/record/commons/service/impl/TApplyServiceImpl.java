package com.ht.micro.record.commons.service.impl;

import com.ht.micro.record.commons.domain.TApply;
import com.ht.micro.record.commons.mapper.baseMapper.TApplyMapper;
import com.ht.micro.record.commons.service.TApplyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: codewj
 * @Date: 2019/8/8 13:33
 * @Description:
 */
@Service
@Slf4j
public class TApplyServiceImpl extends BaseCrudServiceImpl<TApply, TApplyMapper> implements TApplyService {
    @Autowired
    private TApplyMapper tApplyMapper;
    public List<TApply> getByAskedName(String name) {
        return tApplyMapper.getByAskedName(name);
    }

}
