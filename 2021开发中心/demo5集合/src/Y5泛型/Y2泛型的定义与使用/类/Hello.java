package Y5泛型.Y2泛型的定义与使用.类;

/**
 * @Author: yqy
 * @Date: 2021/06/05/14:27
 * @Description:
 */
public class Hello<T> {
    private T name;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }
}
