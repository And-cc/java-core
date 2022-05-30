package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author: yqy
 * @Date: 2022/05/17/10:23
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        collectionTest();
    }

    private static void collectionTest() {
        Collection collection = new ArrayList<>();

        //添加
        collection.add("苹果");
        collection.add(8.222);
        collection.add("香蕉");
        collection.add(7);
        collection.add(true);
        System.out.println(collection.size());
        System.out.println(collection);

        //删除
        collection.remove("苹果");
        System.out.println(collection);

        //遍历
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Object o : collection) {
            System.out.println(o);
        }

        //判断是否包含
        System.out.println(collection.contains("苹果"));
    }

    private static void kidneyCollection() {

    }
}
