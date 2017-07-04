package com.bluecoffee.queue.constants;

/**
 * Created by qianlong on 2017/7/3.
 */
public enum UserGender implements EnumValue<Integer,String>{

    MALE(1,"男"),FEMALE(2,"女");

    private int value;
    private String desc;

    private UserGender(int value,String desc){
        this.value = value;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return super.toString();
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
