package 类的理解.tcm;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: yqy
 * @Date: 2021/05/28/10:31
 * @Description:
 */
public class test04 {
    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        boolean b = containsDuplicate(nums);
        System.out.println(b);
    }
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            //因为集合set中不能有重复的元素，如果有重复的
            //元素添加，就会添加失败
            if (!set.add(num))
                return true;
        }
        return false;
    }

}
