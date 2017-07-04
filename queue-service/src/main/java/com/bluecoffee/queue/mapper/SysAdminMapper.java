package com.bluecoffee.queue.mapper;

import com.bluecoffee.queue.domain.SysAdmin;
import com.bluecoffee.queue.util.mybatis.MyMapper;

import java.util.List;

public interface SysAdminMapper {
    int deleteByPrimaryKey(Long adminId);

    int insert(SysAdmin record);

    int insertSelective(SysAdmin record);

    SysAdmin selectByPrimaryKey(Long adminId);

    int updateByPrimaryKeySelective(SysAdmin record);

    int updateByPrimaryKey(SysAdmin record);

    List<SysAdmin> selectByCond(SysAdmin sysAdmin);
}