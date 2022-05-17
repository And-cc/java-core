package demo06接口lambda内部类.接口.demo9对象克隆.浅克隆;

/**
 * @Author: yqy
 * @Date: 2021/05/31/22:26
 * @Description:
 */
public class TestJava2 {
    public static void main(String[] args) throws CloneNotSupportedException {

        Car car = new Car();
        car.setColor("white");
        Car car1 = (Car) car.clone();
        car1.setColor("blue");

        if (car1 != null) {
            System.out.println("car color: " + car.getColor());
        }
        System.out.println("car1 color: " + car1.getColor());

        System.out.println("car == car1?" + (car == car1));
    }


    private static class Car implements Cloneable {

        private Car() {
        }

        private String color;

        public void setColor(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }
}
