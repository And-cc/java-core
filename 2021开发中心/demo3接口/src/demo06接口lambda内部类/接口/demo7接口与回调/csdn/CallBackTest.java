package demo06接口lambda内部类.接口.demo7接口与回调.csdn;

/**
 * @Author: yqy
 * @Date: 2021/05/31/21:48
 * @Description:
 */
public class CallBackTest {
    public static void main(String[] args) {
        TaxiDriver td = new TaxiDriver();
        Passenger passenger = new Passenger();
        passenger.TakeTaxi(td);
    }



}
