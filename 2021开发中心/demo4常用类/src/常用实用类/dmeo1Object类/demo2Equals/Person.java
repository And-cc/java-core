package 常用实用类.dmeo1Object类.demo2Equals;

/*
*       Object类是Java的根类，所有的类都直接或者间接继承Object
*
* */
public class Person {
    private String name;
    private  int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
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

    //自定义重写equals方法
    /*@Override
    public boolean equals(Object o) {
        //增加一个判断，传递的参数obj是this本身，直接返回true，提高程序效率
        if (o==this){
            return true;
        }
        //增加一个判断，传递的参数obj是null，直接返回false，提高程序效率
        if (o==null){
            return false;
        }
        if (o instanceof Person) {//问题在于，如果比较的不是person类怎么办
            //使用向下转型（强转）把object转为person
            Person person = (Person) o;
            boolean b=this.name.equals(person.name) &&  this.age== person.age;//equals比较基本数据类型:比较值
            return b;
        }
        //不是person类直接false
        return false;
    }
*/
    //工具快捷equals


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }
}
