import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yqy
 * @Date: 2022/05/16/16:22
 * @Description:
 */
public class Generic<T> {
    private T item;

    public Generic(T item) {
        this.item = item;
    }

    public Generic() {

    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Generic{" +
                "item=" + item +
                '}';
    }
    public static  <E> List<E> copyArray(E[] e){
        List<E> list=new ArrayList<>();
        for (E e1 : e) {
            list.add(e1);
        }
        return list;
    }
}
