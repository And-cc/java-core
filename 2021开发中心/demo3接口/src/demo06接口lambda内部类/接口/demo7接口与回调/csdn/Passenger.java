package demo06接口lambda内部类.接口.demo7接口与回调.csdn;

/**
 * @Author: yqy
 * @Date: 2021/05/31/21:46
 * @Description:
 */
public class Passenger implements Callback{
    @Override
    public boolean Consider(int money) {
        boolean result=true;
        if (money>80){
            System.out.println(money+"太贵了，您看80行吗？");
            result=false;
        }
        return result;
    }

    @Override
    public void PayFor(int money) {
        System.out.println("好的，这是您的"+money);
    }
    public void TakeTaxi(TaxiDriver td){        //询问多少钱，就是方法a
        System.out.println("师傅，去天一多少钱？");
        td.Answer(this);
    }
}
