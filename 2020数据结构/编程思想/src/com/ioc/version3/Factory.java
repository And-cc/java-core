package com.ioc.version3;

import java.util.Scanner;

/**
 * @Author: yqy
 * @Date: 2022/04/02/10:44
 * @Description:
 */
public class Factory {
    public static  ISkill getHero(String name) throws Exception {
        ISkill iSkill;
        switch (name){
            case "yasuo":
                iSkill=new Yasuo();
                break;
            case "nuoshou":
                iSkill=new Nuoshou();
                break;
            default:
                throw new Exception();
        }
        return iSkill;
    }
}
