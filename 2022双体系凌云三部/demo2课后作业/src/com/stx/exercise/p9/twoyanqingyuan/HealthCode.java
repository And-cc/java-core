package com.stx.exercise.p9.twoyanqingyuan;

/**
 * @Author: yqy
 * @Date: 2022/03/13/16:38
 * @Description: 健康码类
 */
public class HealthCode extends Code {
    /**
     * 卡类型
     * 红码， 黄码，绿码
     */
    private String codeType;

    public HealthCode(String newCode) {
        super();
    }

    public void show(Code hc){
        System.out.println(codeType);
    }
}
