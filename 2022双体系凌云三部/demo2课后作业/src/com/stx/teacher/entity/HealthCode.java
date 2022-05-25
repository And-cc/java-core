package com.stx.teacher.entity;

/**
 * 健康码重有
 */
public class HealthCode extends Code{
    /**
     * 卡类型
     * 红码， 黄码，绿码
     */
    private String codeType;

    public void show(Code hc){

        System.out.println(codeType);
    }
}
