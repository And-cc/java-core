import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: yqy
 * @Date: 2022/05/16/16:20
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Generic<Kidney> item=new Generic<>();
        item.setItem(new Kidney("金刚不坏大腰子",666666,3,"虎"));
        Kidney kidney = item.getItem();
        System.out.println(kidney.toString());
    }
    private static void test(){
        ArrayList<String> list=new ArrayList<>();
    }

    /**
     * 通配符、占位符
     */
    private static void allFuhao(){
        List<String> list1=new ArrayList<>();
        List<Object> list2=new ArrayList<>();
        print(list1);
        print(list2);
    }
    public static void print(List<?> list){
        Iterator<?> iterator = list.iterator();
        while(iterator.hasNext()){
            Object obj=iterator.next();
            System.out.println(obj);
        }
    }
    private static  void gethaha(){
        List<?> list=new ArrayList<>();
        /*list.add("fdasd");
        list.add(1);*///都是编译不通过的
        List<String> a=new ArrayList<>();
        a.add("金刚不还大腰子");
        a.add("傲娇金贵小腰子");
        list=a;
        System.out.println(list.indexOf(0));
    }
}
