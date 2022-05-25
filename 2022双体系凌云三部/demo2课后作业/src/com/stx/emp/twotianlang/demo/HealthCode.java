package com.stx.emp.twotianlang.demo;

/**
 * @author 田浪
 */
public class HealthCode extends Code {

    public HealthCode(String newCode) {
        super(newCode);
    }

    @Override
    public String show() {
        return newCode;
    }
}
