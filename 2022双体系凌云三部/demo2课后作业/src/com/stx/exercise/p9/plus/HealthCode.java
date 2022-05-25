package com.stx.exercise.p9.plus;

import com.stx.exercise.p9.plus.Code;

/**
 * @Author: yqy
 * @Date: 2022/03/13/16:38
 * @Description: 健康码类
 */
public class HealthCode extends Code {
    public HealthCode() {
    }

    @Override
    public void createCode(String[] arrStr) {
        String status = "";
        for (String str : arrStr) {
            if ("北京".equals(str)) {
                status = "黄码";
            } else if ("城市管理职业学院".equals(str) || "上海".equals(str)) {
                status = "红码";
            } else {
                status = "绿码";
            }
        }
        super.setCode(status);
    }
}
