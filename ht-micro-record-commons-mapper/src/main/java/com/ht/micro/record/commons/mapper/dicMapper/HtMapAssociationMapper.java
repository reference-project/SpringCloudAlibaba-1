package com.ht.micro.record.commons.mapper.dicMapper;

import com.ht.micro.record.commons.domain.HtMapAssociation;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.MyMapper;

import java.util.List;
import java.util.Map;

@Repository
public interface HtMapAssociationMapper extends MyMapper<HtMapAssociation> {
    Integer getMaxId();
    Integer mapCodeSuffix();

    List<HtMapAssociation> selectByNameAlias(Map<String, Object> params);

    List<HtMapAssociation> getAddress(Map<String, Object> params);

    int insertInfo(HtMapAssociation record);

}