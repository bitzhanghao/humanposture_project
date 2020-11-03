package com.bjpowernode.dao;

import com.bjpowernode.domain.HumanData;

import java.util.List;

public interface HumanDataDao
{
    // 查询多个人体姿态数据
    List<HumanData> selectHumanDatas();

    // 根据id查询人体姿态数据
    HumanData selectHumanData(Integer id);

    // 插入姿态数据（增insert）
    int insertHumanData(HumanData hd);

    // 删除姿态数据，根据id
    int deleteHumanData(Integer id);

    // 改,根据id更新人体数据
    int updateHumanData(Integer id);


}
