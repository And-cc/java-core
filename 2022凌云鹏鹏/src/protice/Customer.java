package protice;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName Custmer.java
 * @Description TODO
 * @createTime 2022年05月19日 20:42:00
 */
public class Customer implements Runnable {
    private Box b;
    public Customer(Box b) {
        this.b=b;
    }
    @Override
    public void run() {
       while (true){
           b.get();
       }
    }
}
