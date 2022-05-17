package demo2抽象类;

public abstract class Person {   //类中有抽象方法则类必须为抽象类
    private String name;  //私有属性
    public abstract String getDescription(); //描述
    public Person(String name){ //构造方法
        this.name=name;
    }
    public String getName() {
        return name;
    }
}
