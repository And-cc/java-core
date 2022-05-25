package com.stx.heart.binaryname;

import java.util.ArrayList;
import java.util.List;

public class Card {

    private String name;
    private List<Integer> digits = new ArrayList<>();
    public Card(String name) {
        this.name = name;
    }

    public void add(int digit) {
        digits.add(digit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < digits.size(); i++) {
            sb.append(digits.get(i)).append(" ");
            /*if (i > 0 && i % 10 == 0) {
                sb.append("\r\n");
            }*/
        }
        return sb.toString();
    }

    public String getName() {
        return name;
    }
}
