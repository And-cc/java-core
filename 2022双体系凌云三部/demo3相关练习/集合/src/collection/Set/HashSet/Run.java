package collection.Set.HashSet;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: yqy
 * @Date: 2022/05/18/15:37
 * @Description:
 * HashSet=数组+链表+红黑树
 * 基于hashCode实现元素不重复
 * 当存入元素的哈希码相同时，才会调用equals进行确认，如果结果为true,则拒绝后者存入
 */
public class Run {

    @Test
    public void test(){
        Set<String> set=new HashSet<>();
        set.stream().sorted();
    }
}
