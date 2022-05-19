package 实际应用;

/**
 * @Author: yqy
 * @Date: 2022/05/16/21:55
 * @Description:
 */
public class Kidney implements Comparable<Kidney>{
    private String name;
    private Integer price;
    private Integer number;
    private String type;

    public Kidney(String name, Integer price, Integer number, String type) {
        this.name = name;
        this.price = price;
        this.number = number;
        this.type = type;
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

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type+"的"+number+"只"+name+"     售价仅为"+price+"￥";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Kidney kidney = (Kidney) o;

        if (name != null ? !name.equals(kidney.name) : kidney.name != null) return false;
        if (price != null ? !price.equals(kidney.price) : kidney.price != null) return false;
        if (number != null ? !number.equals(kidney.number) : kidney.number != null) return false;
        return type != null ? type.equals(kidney.type) : kidney.type == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Kidney o) {
        if (this.number!=o.getNumber()){
            return this.getNumber()-o.getNumber();
        }else {
            if (this.getPrice()!=o.getPrice()){
                if (this.getPrice()>o.getPrice()){
                    return 1;
                }else {
                    return -1;
                }
            }else {
                return this.getName().compareTo(o.name);
            }
        }
    }
}
