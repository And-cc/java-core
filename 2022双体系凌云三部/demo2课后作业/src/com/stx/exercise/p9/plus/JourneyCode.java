package com.stx.exercise.p9.plus;

import com.stx.exercise.p9.plus.Code;

/**
 * @Author: yqy
 * @Date: 2022/03/13/17:24
 * @Description: 行程码类
 */
public class JourneyCode extends Code {
    public JourneyCode() {
    }

    @Override
    public void createCode(String[] arrStr) {
        String status = "";
        for (String str : arrStr) {
            if ("城市管理职业学院".equals(str) || "上海".equals(str) || "北京".equals(str)) {
                status = "异常";
            } else {
                status = "正常";
            }
        }
        super.setCode(status);
    }
}
