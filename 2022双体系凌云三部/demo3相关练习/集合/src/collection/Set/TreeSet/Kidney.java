package collection.Set.TreeSet;

/**
 * @Author: yqy
 * @Date: 2022/05/18/9:32
 * @Description: hashcode和equals要一起重写，如果只有equals,也是无法比较的
 */
public class Kidney implements Comparable<Kidney> {
    private String  name;
    private Integer price;

    public Kidney(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name+"仅售"+price+"园";
    }
    @Override
    public int compareTo(Kidney o) {
        if (this.getPrice()!=o.getPrice()){
            return this.getPrice()-o.getPrice();
        }else {
            return this.getName().compareTo(o.getName());
        }
    }
}
