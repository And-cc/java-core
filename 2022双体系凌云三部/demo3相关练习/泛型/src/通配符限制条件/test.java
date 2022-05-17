package 通配符限制条件;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yqy
 * @Date: 2022/05/16/21:33
 * @Description:
 */
public class test {
    public static void main(String[] args) {
        List<? extends Person> list1=new ArrayList<>();
        List<? super Person> list2=new ArrayList<>();
        List<Student> students=new ArrayList<>();
        List<Person> people=new ArrayList<>();
        List<Object> objects=new ArrayList<>();

        /*list1=students;
        list1=people;
        list1=objects;//；编译不通过

        list2=students;//编译不通过
        list2=people;
        list2=objects;*/
    }
}
