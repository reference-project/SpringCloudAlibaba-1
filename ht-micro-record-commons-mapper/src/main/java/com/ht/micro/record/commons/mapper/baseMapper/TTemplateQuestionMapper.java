package com.ht.micro.record.commons.mapper.baseMapper;

import com.ht.micro.record.commons.domain.TTemplateQuestion;
import tk.mybatis.mapper.MyMapper;

import java.util.List;
import java.util.Map;

public interface TTemplateQuestionMapper extends MyMapper<TTemplateQuestion> {
    List<Map<String, Object>> searchTop(Map<String, Object> params);

}