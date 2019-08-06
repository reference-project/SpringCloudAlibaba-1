package com.ht.micro.record.commons.mapper.baseMapper;

import com.ht.micro.record.commons.domain.TCaseInfo;
import tk.mybatis.mapper.MyMapper;

import java.util.List;
import java.util.Map;

public interface TCaseInfoMapper extends MyMapper<TCaseInfo> {
    List<Map<String, Object>> selectSortByType(Map<String, Object> userIds);

    List<Map<String, Object>> applyChoice(Map<String, Object> params);

    List<TCaseInfo> recordScreen(Map<String, Object> params);

    List<TCaseInfo> selectCaseInfoList(Map<String, Object> params);

    List<TCaseInfo> selectNotAlarms(Map<String, Object> params);

    List<TCaseInfo> getCaseInfoList(Map<String, Object> params);
    //文本少于100字
    List<TCaseInfo> selectText(Map<String, Object> params);

    List<TCaseInfo> selectMissing(Map<String, Object> params);

}