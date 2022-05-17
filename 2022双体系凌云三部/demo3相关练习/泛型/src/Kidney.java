/**
 * @Author: yqy
 * @Date: 2022/05/16/16:27
 * @Description:
 */
public class Kidney {
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


}
