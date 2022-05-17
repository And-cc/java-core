package demo2抽象类;

public class Student extends Person{
    private  String major;//专业
    public Student(String name,String major) {
        super(name);
        this.major=major;
    }
    @Override
    public String getDescription() {
        return major+"专业的学生";
    }
}
