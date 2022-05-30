package Map.HashMap;

/**
 * @Author: yqy
 * @Date: 2022/05/17/15:04
 * @Description:
 */
public class Kidney {
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
        return number + "只" + name + "仅售" + price + "￥";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Kidney kidney = (Kidney) o;

        if (number != kidney.number) return false;
        if (Double.compare(kidney.price, price) != 0) return false;
        return name != null ? name.equals(kidney.name) : kidney.name == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + number;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
