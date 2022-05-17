package Y3Lambda表达式无参无返回值练习;

/*
需求：给定一个厨子cook接口，内含唯一抽象方法makeFood，且无参数，无返回值
     使用lambda表达式格式调用invokeCook方法，打印输出“客官，您的红骚肉”字样
 */
public class Test {
    public static void main(String[] args) {
        //调用invokeCook方法，参数是Cook接口，传递Cook接口的匿名内部类对象
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("客官，您的红骚肉");
            }
        });
        //使用lambda表达式
        invokeCook(()->{
            System.out.println("客官，您的宫爆鸡丁");
        });
    }
    public static  void invokeCook(Cook cook){
        cook.makeFood();
    }
}
