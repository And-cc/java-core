package protice;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName Producer.java
 * @Description TODO
 * @createTime 2022年05月19日 20:42:00
 */
public class Producer implements Runnable{
    private Box b;
    public Producer(Box b) {
        this.b=b;
    }

    @Override
    public void run() {
        for (int i =1 ; i <= 5; i++) {
            b.put(i);
        }
    }
}
