package com.bluecoffee.queue.service;

import com.bluecoffee.queue.constants.UserGender;
import com.bluecoffee.queue.constants.UserOrderState;
import com.bluecoffee.queue.domain.UserOrder;
import com.bluecoffee.queue.dto.BaseResult;
import com.bluecoffee.queue.dto.PageResult;
import com.bluecoffee.queue.mapper.UserOrderMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by qianlong on 2017/7/3.
 */
@Service
public class UserOrderService {

    @Autowired
    private UserOrderMapper userOrderMapper;

    public BaseResult applyOrder(UserOrder userOrder){
        BaseResult result = new BaseResult();

        userOrder.setGender(UserGender.MALE.getValue());
        userOrder.setState(UserOrderState.UnOrder.getValue());
        userOrder.setOrderType(1);
        userOrder.setOrderApplyTime(new Date());
        userOrder.setCreateTime(new Date());
        userOrder.setUpdateTime(new Date());
        userOrderMapper.insertSelective(userOrder);

        result = BaseResult.setSuccessResult("用户预约成功");
        return result;
    }

    public PageResult<UserOrder> listUserOrder(UserOrder userOrder){
        if (userOrder.getPage() != null && userOrder.getRows() != null) {
            PageHelper.startPage(userOrder.getPage(), userOrder.getRows());
        }

        List<UserOrder> userOrderList = userOrderMapper.listUserOrderByCond(userOrder);
        return new PageResult(userOrderList);
    }

}
