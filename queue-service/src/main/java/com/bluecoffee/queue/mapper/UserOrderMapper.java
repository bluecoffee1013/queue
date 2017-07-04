package com.bluecoffee.queue.mapper;

import com.bluecoffee.queue.domain.UserOrder;

import java.util.List;

public interface UserOrderMapper {
    int deleteByPrimaryKey(Long orderId);

    int insert(UserOrder record);

    int insertSelective(UserOrder record);

    UserOrder selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(UserOrder record);

    int updateByPrimaryKey(UserOrder record);

    List<UserOrder> listUserOrderByCond(UserOrder userOrder);
}