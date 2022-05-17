package demo06接口lambda内部类.接口.demo7接口与回调.csdn;

/**
 * @Author: yqy
 * @Date: 2021/05/31/21:44
 * @Description:
 */
public interface Callback { //回调方类A的接口
    boolean Consider(int money); //思考是否付钱，就是方法c
    void PayFor(int money);      //付钱,就是方法c

}
