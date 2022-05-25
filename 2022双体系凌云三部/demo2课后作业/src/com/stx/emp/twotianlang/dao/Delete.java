package com.stx.emp.twotianlang.dao;

import com.stx.emp.twotianlang.demo.Person;

/**
 * @title
 * @description 删除
 * @author tianlang
 * @updateTime 2022/3/14 15:14
 * @throws
 */
public class Delete {
    public void delete(String idCode, Person[] people) throws NullPointerException{
        for (int i = 0; i <people.length; i++) {
            if(people[i]!=null){
                if(idCode.equals(people[i].getIdCode())){
                    people[i]=null;
                    System.out.println("删除成功！");
                    return;
                }
            }
            }
        System.out.println("没有该用户：请重新删除!");
        }
    }
