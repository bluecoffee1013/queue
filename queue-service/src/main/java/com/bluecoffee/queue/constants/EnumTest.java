package com.bluecoffee.queue.constants;

import com.bluecoffee.queue.domain.UserOrder;

/**
 * Created by qianlong on 2017/7/4.
 */
public class EnumTest {

    public static void main(String[] args){
        System.out.println(UserGender.MALE.getValue());
        System.out.println(UserGender.MALE.getDesc());
        System.out.println(UserOrderState.finish.getDesc());
    }
}
