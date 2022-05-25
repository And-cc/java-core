package card;

import java.util.Arrays;
import java.util.Random;

/**
 * @Author: yqy
 * @Date: 2022/03/16/18:54
 * @Description:
 */
public class RandomCard {
    private Random random = new Random();
    private int cardLen=3;
    private final String[] flower={"♠","♣","♥","♦"};
    private final String[] numbers={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    private String[] cards=new String[52];


    /**
     * 生成牌
     */
    private void createCards(){
        String temp="";
        int k=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < flower.length; j++) {
                cards[k]=numbers[i]+flower[j];
                k++;
            }
        }
    }


    /**
     * 发牌
     */
    public Card[] sendOne(int length){
        if(length>17 || length<1){
            System.out.println("人数不符，请重新输入！");
            return null;
        }
        createCards();
        //根据人数生成牌
        Card[] finals=new Card[length];
        /**
         * 还剩牌的长度
         */
        int len = cards.length;
        /**
         * 每次生成一副牌
         */
        for (int z = 0; z < finals.length; z++) {
            String[] temp=new String[cardLen];
            for (int j = 0; j < cardLen; j++) {
                int i = random.nextInt(len);
                temp[j]=cards[i];
                String[] temArr = copyArr(cards, i);
                /**
                 * 重置数组，避免一张牌发两次
                 */
                cards=temArr;
                /**
                 * 数组减少，随机数也减少
                 */
                len--;
            }
            Card cc=new Card(temp);
            finals[z]=cc;
        }
        return finals;
    }

    public String[] copyArr(String[] arr,int i){
        arr[i]=null;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]==null){
                String temp=arr[j];
                arr[j]=arr[arr.length-1];
                arr[arr.length-1]=temp;
                break;
            }
        }
        return Arrays.copyOf(arr, arr.length - 1);
    }

    public Card[] big(Card[] cc){
        if(cc.length==0 || cc==null){

            return null;
        }
        return null;
    }
}
