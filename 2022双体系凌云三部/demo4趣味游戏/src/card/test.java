package card;

/**
 * @Author: yqy
 * @Date: 2022/03/16/21:04
 * @Description:
 */
public class test {
    public static void main(String[] args) {
        RandomCard card = new RandomCard();
        Card[] cards = card.sendOne(17);
        for (Card card1 : cards) {
            System.out.println(card1.toString());
        }
    }
}
