package com.ht.micro.record.commons.mapper.dicMapper;

import com.ht.micro.record.commons.domain.HtOutsideAssociation;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.MyMapper;

import java.util.List;

@Repository
public interface HtOutsideAssociationMapper extends MyMapper<HtOutsideAssociation> {

    Integer maxId();

    Integer maxCodeSuffix();

    List<HtOutsideAssociation> maxCode();

    //List<HtOutsideAssociation> selectByExample(Example example1);

    int insertInfo(HtOutsideAssociation record);
}