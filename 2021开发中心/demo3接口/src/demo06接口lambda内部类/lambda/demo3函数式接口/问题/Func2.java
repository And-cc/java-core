package demo06接口lambda内部类.lambda.demo3函数式接口.问题;

/**
 * @Author: yqy
 * @Date: 2021/06/01/17:46
 * @Description:
 */
@FunctionalInterface
public interface Func2 {

    boolean equals(Object o);//因为这个方法签名是Object类的public方法


    void run();    //这就OK了。一个抽象方法，一个Object的public方法，相安无事


    //Object clone();//这又不行了，因为前面明确说了，要是Object的public方法，而clone是protected的

/**
* @Author: yqy
* @Date: 2021/6/1
* @Description: 总结
* 函数式接口，有且仅有一个抽象方法，Object的public方法除外。
*/

}
