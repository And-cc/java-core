package card;

import java.util.Arrays;

/**
 * @Author: yqy
 * @Date: 2022/03/16/21:27
 * @Description:
 */
public class Card {
    private String[] card;

    public Card(String[] card) {
        this.card = card;
    }

    public String[] getCard() {
        return card;
    }

    public void setCard(String[] card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return Arrays.toString(card);
    }
    
    public Card Max(Card c){
        String[] card1 = c.getCard();
        for (int i = 0; i < card1.length; i++) {
            
        }
        return null;
    }
}
