package Y6斗地主案例;
/*
    一：准备牌
    二：洗牌
          使用集合工具类Collections中的方法
          static void shuffle(list<?> list )使用默认随机源对指定列表进行置换
    三：发牌
    四：看牌
 */

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        //一：准备牌
            ArrayList<String> poker=new ArrayList<>();
            poker.add("大王");
            poker.add("小王");
            String[] color={"♥","♣","♦","♠"};
            String[] numbers={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
            for (String c:color){
                for (String num:numbers){
                    poker.add(c+num);
                }
            }
            //先试下存进去没有
            /*System.out.println(poker);
            Iterator<String> iterator = poker.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }*/
        //二：洗牌
            Collections.shuffle(poker);
            //看看洗好没
            /*Iterator<String> iterator = poker.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }*/
        //三：发牌
            ArrayList<String> player01=new ArrayList<>();
            ArrayList<String> player02=new ArrayList<>();
            ArrayList<String> player03=new ArrayList<>();
            ArrayList<String> dipai=new ArrayList<>();

            for (int i=0;i<poker.size();i++){
                //获取每一张牌
                String pk = poker.get(i);
                //轮流发牌
                if (i>=51){
                    dipai.add(pk);
                }else if (i%3==0){
                    player01.add(pk);
                }else if (i%3==1){
                    player02.add(pk);
                }else if (i%3==2){
                    player03.add(pk);
                }

            }
        //四：看牌
            System.out.println("player01:"+player01);
            System.out.println("player02:"+player02);
            System.out.println("player03:"+player03);
            System.out.println("dipai:"+dipai);
    }
}
