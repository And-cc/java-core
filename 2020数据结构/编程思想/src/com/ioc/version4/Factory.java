package com.ioc.version4;

/**
 * @Author: yqy
 * @Date: 2022/04/02/10:44
 * @Description:
 */
public class Factory {
    public static ISkill getHero(String name) throws Exception {
        ISkill iSkill;
        String str="com.ioc.version4."+name;
        Class<?> forName = Class.forName(str);
        Object o = forName.newInstance();
        return (ISkill) o;
    }
}
