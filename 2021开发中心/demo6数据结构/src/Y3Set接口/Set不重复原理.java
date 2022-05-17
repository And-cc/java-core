package Y3Set接口;

import java.util.HashSet;
import java.util.Set;

/*
    set集合中不允许出现重复的元素
 */
public class Set不重复原理 {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        String s1=new String("abc");
        String s2=new String("abc");
        set.add(s1);
        set.add(s2);
        set.add("重地");
        set.add("通话");
        set.add("abc");
        System.out.println(set);//[重地, 通话, abc]
    }
}
