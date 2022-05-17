package demo06接口lambda内部类.接口.demo9对象克隆.深克隆;

/**
 * @Author: yqy
 * @Date: 2021/06/01/12:27
 * @Description:
 */

    public class 问题 {

        public static void main(String[] args) {
            Engine engine = new Engine();
            engine.setModel("CA");
            Car car = new Car();
            car.setEngine(engine);
            Car newCar = (Car) car.clone();
            newCar.getEngine().setModel("CY");
            System.out.println("Car Engine Model:" + car.getEngine().getModel());
            System.out.println("newCar Engine Model: " + newCar.getEngine().getModel());
        }


        private static class Car implements Cloneable {

            private Car() {

            }

            private Engine engine;
            private String color;

            public void setColor(String color) {
                this.color = color;
            }

            public String getColor() {
                return color;
            }

            public void setEngine(Engine engine) {
                this.engine = engine;
            }

            public Engine getEngine() {
                return engine;
            }

            @Override
            protected Object clone() {
                try {
                    return super.clone();
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
                return null;
            }
        }

        private static class Engine {

            private String model;

            public void setModel(String model) {
                this.model = model;
            }

            public String getModel() {
                return model;
            }
        }
    }
