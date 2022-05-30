package 实际应用;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @Author: yqy
 * @Date: 2022/05/16/21:57
 * @Description:
 */
public class test {
    public static void main(String[] args) {
        BaseDao<Kidney> kidneyDao = new BaseDao<>();
        kidneyDao.save("1", new Kidney("金刚不坏大腰子", 66666, 2, "虎"));
        kidneyDao.save("2", new Kidney("滴滴答答可爱腰子", 622226666, 2, "马"));
        kidneyDao.save("3", new Kidney("傲娇金贵小腰子", 111111, 2, "猪"));
        List<Kidney> kidneys = new ArrayList<>();
        kidneys.sort(new Comparator<Kidney>() {
            @Override
            public int compare(Kidney o1, Kidney o2) {
                return 0;
            }
        });
    }
}
