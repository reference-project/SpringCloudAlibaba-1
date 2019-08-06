package com.ht.micro.record.commons.mapper.dicMapper;

import com.ht.micro.record.commons.domain.MapAssociation;
import tk.mybatis.mapper.MyMapper;

import java.util.HashMap;
import java.util.List;

public interface MapAssociationMapper extends MyMapper<MapAssociation> {
    List<MapAssociation> findByPoliceCode(HashMap<String, Object> params);

}