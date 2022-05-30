package 拉煤车案例;

/**
 * @Author: yqy
 * @Date: 2022/05/23/15:20
 * @Description:
 */
public class Product {
    private int item;
    private boolean flag = false;//false：没装满，true：装满了

    public synchronized void getItem() {
        //如果货已经已经装满，我们就取走并通知装下一车
        if (flag) {
            System.out.println("getItem--" + item);
            flag = false;
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //通知别人已经把货取走
            notify();
        } else {//如果货还没装满，我么就等待别人把货装满
            /*等待*/
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void setItem(int item) {
        //如果货已经装满，我们等别人拉走这车货
        if (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {//如果货还没装满，我们就把货装满，然后通知别人来拉货
            this.item = ++item;
            System.out.println("setItem--" + this.item);
            flag = true;
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //通知别人货装满了
            notify();
        }
    }
}
