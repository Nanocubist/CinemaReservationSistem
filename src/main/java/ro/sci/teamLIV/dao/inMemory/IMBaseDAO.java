package ro.sci.teamLIV.dao.inMemory;
import ro.sci.teamLIV.dao.BaseDAO;
import ro.sci.teamLIV.domain.AbstractModel;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public class IMBaseDAO<T extends AbstractModel> implements BaseDAO<T> {

    protected Map<Long, T> models = new HashMap<Long, T>();

    private static AtomicLong ID = new AtomicLong(System.currentTimeMillis());

    @Override
    public Collection<T> getAll() {

        return models.values();
    }


    public T findById(Long id) {

        return models.get(id);
    }

    @Override
    public T update(T model) {
        if (model.getId() <= 0) {
            model.setId(ID.getAndIncrement());
        }

        models.put(model.getId(), model);
        return model;
    }

    @Override
    public boolean delete(T model) {
        boolean result = models.containsKey(model.getId());

        if (result)
            models.remove(model.getId());
        return result;
    }
}
