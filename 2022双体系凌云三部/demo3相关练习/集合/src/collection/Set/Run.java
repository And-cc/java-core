package collection.Set;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author: yqy
 * @Date: 2022/05/18/9:32
 * @Description:
 */
public class Run {
    /***
    * @Author: yqy
    * @Date: 2022/5/18
    * @Description:
     * * String类型基本测试，因为set是一个接口，所以我们暂时用hashset实现类来测试
    */
    @Test
    public void test(){
        Set<String> set=new HashSet<>();
        //添加
        set.add("小米");
        set.add("华为");
        set.add("菠萝");
        set.add("华为");//是添加进去了，但是覆盖掉了前面的华为

        //打印
        System.out.println(set.size());
        System.out.println(set);

        //删除
        set.remove("菠萝");
        System.out.println(set);

        //增强for遍历
        for (String s : set) {
            System.out.println(s);
        }
        //迭代器遍历
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //判断
        boolean b = set.contains("小米");
        boolean empty = set.isEmpty();
        System.out.println("是否有小米呢？"+b);
        System.out.println("是否为空呢？"+empty);
    }

    /***
    * @Author: yqy
    * @Date: 2022/5/18
    * @Description: 对象数据类型基本测试
    */
    @Test
    public void test2(){
        Set<Kidney> ks=new HashSet<>();
        Kidney k1=new Kidney("水桶腰子",88);
        Kidney k2=new Kidney("金刚腰子",66);
        Kidney k3=new Kidney("砖石腰子",89);

        ks.add(k1);
        ks.add(k2);
        ks.add(k3);
        ks.add(k1);//重写hashcode之后，是无法添加重复内容的

        System.out.println(ks.size());
        System.out.println(ks);

        //for遍历
        for (Kidney k : ks) {
            System.out.println(k.toString());
        }


        System.out.println("删掉了吗？？？");
        //删除
        ks.remove(new Kidney("水桶腰子",88));//这是可以删掉的，因为重写了hashcode和equals方法，判断出来是同一对象
        ks.remove(k2);

        //iterator遍历
        Iterator<Kidney> iterator = ks.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }


    }
}
