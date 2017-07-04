package com.bluecoffee.queue.rest;

import com.bluecoffee.queue.domain.UserOrder;
import com.bluecoffee.queue.dto.BaseResult;
import com.bluecoffee.queue.dto.userorder.ApplyOrderRequest;
import com.bluecoffee.queue.service.UserOrderService;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by qianlong on 2017/7/4.
 */
@RestController
public class UserOrderController {

    @Autowired
    private UserOrderService userOrderService;

    @RequestMapping(value = "/applyOrder", method = RequestMethod.POST, produces = "application/json")
    public BaseResult applyOrder(@RequestBody ApplyOrderRequest request){
        try{
            UserOrder userOrder = new UserOrder();
            BeanUtils.copyProperties(userOrder,request);
            userOrder.setOrderType(1);

            for(int i=1;i<20;i++){
                userOrder = new UserOrder();
                userOrder.setIdCardNumber(""+i);
                userOrder.setOrderDate(new Date());
                userOrderService.applyOrder(userOrder);
            }

            return BaseResult.setSuccessResult("预约成功");
//            return userOrderService.applyOrder(userOrder);
        }catch (Exception ex){
            ex.printStackTrace();
            return BaseResult.setErrorResult("999999",ex.getMessage());
        }
    }
}
