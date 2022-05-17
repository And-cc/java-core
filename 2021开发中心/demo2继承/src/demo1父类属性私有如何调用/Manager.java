package demo1父类属性私有如何调用;

public class Manager extends Employee{
    private double bouns;//奖金
    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
    }
    public double getSalary(){
        double baseSalary=super.getSalary();//调用父类的工资
        return baseSalary+bouns;
    }
    public void setBouns(double b){
        this.bouns=b;
    }
}
