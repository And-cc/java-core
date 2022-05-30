package 实际应用;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @Author: yqy
 * @Date: 2022/05/16/21:46
 * @Description:
 */
public class BaseDao<T> {
    private Map<String, T> map;

    public void save(String id, T entity) {
        map.put(id, entity);
    }

    public T getById(String id) {
        return map.get(id);
    }

    public void update(String id, T entity) {
        if (map.containsKey(id)) {
            map.put(id, entity);
        }
    }

    public List<T> list() {
        Collection<T> values = map.values();
        ArrayList<T> list = new ArrayList<>();
        for (T value : values) {
            list.add(value);
        }
        return list;
    }

    public void delete(String id) {
        map.remove(id);
    }
}
