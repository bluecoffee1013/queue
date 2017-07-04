package com.bluecoffee.queue.constants;

/**
 * Created by qianlong on 2017/7/3.
 */
public enum UserOrderState implements EnumValue<Integer,String>{

    UnOrder(1,"未预约"),Ordered(2,"已预约"),hasGetNo(3,"已取号"),finish(4,"已结束");

    private int value;
    private String desc;

    private UserOrderState(int value,String desc){
        this.value = value;
        this.desc = desc;
    }


    @Override
    public Integer getValue() {
        return value;
    }

    @Override
    public String getDesc() {
        return desc;
    }
}
