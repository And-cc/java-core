package com.stx.emp.twotianlang.demo;
/**
 * @author 田浪
 */
public class TravelCode extends Code {
    public TravelCode(String newCode) {
        super(newCode);
    }

    @Override
    public String show() {
        return this.newCode;
    }
}
