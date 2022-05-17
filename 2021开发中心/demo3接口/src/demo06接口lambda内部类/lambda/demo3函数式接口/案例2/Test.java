package demo06接口lambda内部类.lambda.demo3函数式接口.案例2;

/**
 * @Author: yqy
 * @Date: 2021/06/01/17:54
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.test(10,()-> System.out.println("A customed func."));
        test.test(100,test::customedFunc);

    }
    public void customedFunc(){
        System.out.println("a customed method reference");
    }
    public void test(int x,Func func){
        System.out.println(x);
        func.run();
    }
}
