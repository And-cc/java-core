package demo06接口lambda内部类.接口.demo7接口与回调.csdn;

/**
 * @Author: yqy
 * @Date: 2021/05/31/21:44
 * @Description:
 */
public class TaxiDriver { //调用方类B
    public int Answer(Callback callback){  //回答多少钱，就是方法b
        System.out.println("去那的话100快");
        if (callback.Consider(100)==true){
            callback.PayFor(100);
        }
        return 100;
    }
}
