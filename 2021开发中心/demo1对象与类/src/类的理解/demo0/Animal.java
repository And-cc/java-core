package 类的理解.demo0;

/**
 * @Author: yqy
 * @Date: 2021/05/27/12:16
 * @Description:什么是类？和对象有什么关系？
 */
//public 公共的     class 类    Animal 类的名字
public class Animal {
        //动物的age和分类是一种抽象的属性
        private int age;//动物有年龄
        private String type;//动物有分类
        //eat是动物的行为，是一种方法
        public void eat(String food){
            System.out.println("吃"+food);
        }
}
//我的思考：类就是对现实的、具体的对象的一种抽象


/**
* @Author: yqy
* @Date: 2021/5/27
* @Description: 抽象的类如何使用？
*/
class  test {
    public static void main(String[] args) {
        Animal dog=new Animal();  //要使用animal的抽象类 就要先实例化这个类
        dog.eat("骨头");     //实例化dog才能使用animal的eat方法
    }
}
