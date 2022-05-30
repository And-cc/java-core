package collection.Set;

/**
 * @Author: yqy
 * @Date: 2022/05/18/9:32
 * @Description: hashcode和equals要一起重写，如果只有equals,也是无法比较的
 */
public class Kidney {
    private String name;
    private Integer price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Kidney kidney = (Kidney) o;

        if (name != null ? !name.equals(kidney.name) : kidney.name != null) return false;
        return price != null ? price.equals(kidney.price) : kidney.price == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }

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

    @Override
    public String toString() {
        return name + "仅售" + price + "园";
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
