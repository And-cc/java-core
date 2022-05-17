package demo7常用实用类.dmeo1Object类.demo1ToString;

/*
*       Object类是Java的根类，所有的类都直接或者间接继承Object
*
* */
public class demo1ToString {
    private String name;
    private  int age;

    public demo1ToString(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public demo1ToString() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "demo1ToString{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
