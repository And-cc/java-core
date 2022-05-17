package Conllections;

/**
 * @Author: yqy
 * @Date: 2022/05/17/15:04
 * @Description:
 */
public class Kidney implements Comparable<Kidney>{
    private String name;
    private int number;
    private double price;

    public Kidney() {
    }

    public Kidney(String name, int number, double price) {
        this.name = name;
        this.number = number;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return number+"只"+name+"仅售"+price+"￥" ;
    }
    @Override
    public int compareTo(Kidney o) {
        if (this.getPrice()!=o.getPrice()){
            if (this.getPrice()>o.getPrice()){
                return 1;
            }else {
                return -1;
            }
        }else {
            if (this.getNumber()!=o.getNumber()){
                return this.getNumber()-o.getNumber();
            }else {
                return this.getName().compareTo(o.getName());
            }
        }
    }
}
