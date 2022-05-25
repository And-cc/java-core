package com.stx.exercise.p9.twoyanqingyuan;


/**
 * @Author: yqy
 * @Date: 2022/03/13/17:24
 * @Description: 行程码类
 */
public class JourneyCode extends Code {
    /**
     * 经过地区
     */
    private Area[] areas;


    public JourneyCode(String[] area) {
        super();
    }


    @Override
    public void show(){
        System.out.print("你最近15天经过的地区有，");
        for (int i = 0; i < areas.length; i++) {
            /**
             * 获取地区，如果是中高风险地区打印*号
             */
            System.out.println(areas[i].getCity()+(areas[i].isRisk()?"*":"")+",");
        }
    }

    public void setAreas(Area[] areas) {
        this.areas = areas;
    }
}
