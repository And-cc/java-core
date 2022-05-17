package Y5Lambda表达式有参有返回值练习2;

/*
需求：给定一个计算器Calculator接口，内含抽象方法calc可以将两个int数字相加得到和值
     使用lambda的标准格式调用invokeCalc方法，完成120和130的相加计算
 */
public class Test {
    public static void main(String[] args) {
        //匿名内部类
        invokeCalc(130, 120, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        });
        //lambda表达式,简化匿名内部类
        invokeCalc(6,111,(int a,int b)->{
            return a*b;
        });
        //再精简版本Y6
        invokeCalc(523,111,(a,b)->a/b);
    }
    private static void invokeCalc(int a,int b,Calculator calculator){
        int result = calculator.calc(a, b);
        System.out.println("结果："+result);
    }
}
