package Y2异常处理.Y7异常的注意事项;
//如果finally有return语句，永远返回finally中的结果，避免该情况
public class Y2Finally有return语句 {
    public static void main(String[] args) {
        System.out.println(getA());//100
    }
    public static int getA(){
        int a=10;
        try{
            return a;
        }catch (Exception e){
            System.out.println(e);
        }finally {
            a=100;
            return a;
        }
    }
}
