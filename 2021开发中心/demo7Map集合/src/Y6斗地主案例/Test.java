package Y6斗地主案例;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

//有序斗地主
/*
   1.准备牌：Map<索引,54张牌>
         特殊牌(大王，小王)
         52张牌：循环遍历两个集合/数组，组装五十二张牌
   2.洗牌：洗索引
   3.发牌：每人17张，三张底牌
   4.排序：通过索引排序
   5.看牌：通过索引，拿到牌
 */
public class Test {
    public static void main(String[] args) {
        //1.准备牌
        //定义map集合，存储牌的索引和组装好的牌
        HashMap<Integer, String> poker = new HashMap<>();
        //创建一个list集合，，存储牌的索引
        ArrayList<Integer> pokerIndex=new ArrayList<>();
        //创建两个数组，存储牌的花色和牌的序号
        String[] color={"♥","♣","♦","♠"};
        String[] numbers={"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        //把大王小王存到索引
        int index=0;
        poker.put(index,"大王");
        pokerIndex.add(index);
        index++;
        poker.put(index,"小王");
        pokerIndex.add(index);
        index++;
        //循环嵌套遍历组装52张牌
        for ( String s:numbers){
            for (String num : color) {
                poker.put(index,s+num);
                pokerIndex.add(index);
                index++;
            }
        }
        //2.洗牌：Collections中的方法shuffle(list)
        Collections.shuffle(pokerIndex);
        //3.发牌：定义四个集合，存储玩家牌的索引和底牌的索引
        ArrayList<Integer> p1=new ArrayList<>();
        ArrayList<Integer> p2=new ArrayList<>();
        ArrayList<Integer> p3=new ArrayList<>();
        ArrayList<Integer> dp=new ArrayList<>();
        //遍历存储牌索引的list集合，获取每一个牌的索引
        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer in = pokerIndex.get(i);
            //先判断底牌
            if (i>=51){
                //给底牌发牌
                dp.add(in);
            }else if (i%3==0){
                p3.add(in);
            }else if (i%3==1){
                p2.add(in);
            }else if (i%3==2){
                p1.add(in);
            }
        }
        //4.排序：使用collections中的方法sort（list）
        // 默认升序
        Collections.sort(p1);
        Collections.sort(p2);
        Collections.sort(p3);
        Collections.sort(dp);
        //看牌：定义一个看牌的方法，提高代码复用性
        lookPoker("张三",poker,p1);
        lookPoker("李四",poker,p2);
        lookPoker("王五",poker,p3);
        lookPoker("底牌",poker,dp);
    }
    /*
        参数：
            String name:玩家名称
            HashMap<Integer,String> poker:存储牌的poker集合
            ArrayList<Integer> list:存储玩家和底牌的list集合
         */
    public static void lookPoker(String name,HashMap<Integer,String> poker,ArrayList<Integer> list){
        //输出玩家名字：
        System.out.print(name+":");
        //遍历玩家和底牌的集合，获取牌的索引
        for (Integer key : list) {
            //使用牌的索引，找到对应的牌
            String value=poker.get(key);
            System.out.print(value+" ");
        }
        //打印完每一个玩家的牌，换行
        System.out.println();
    }
}
