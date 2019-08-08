package com.ht.micro.record.commons.service;

import com.ht.micro.record.commons.domain.TApply;

import java.util.List;

/**
 * @Auther: codewj
 * @Date: 2019/8/8 13:32
 * @Description:
 */
public interface TApplyService extends BaseCrudService<TApply> {

    List<TApply> getByAskedName(String name);
}
