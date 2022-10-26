package src.main.java.utility.interfaces;

import src.main.java.dao.models.Attorney;

import java.util.List;
import java.util.Optional;

public interface IAttorneyDAO extends IBaseDAO<Attorney> {

    Optional<Attorney> get(long id);

    List<Attorney> getAll();

    void save(Attorney attorney);

    void update(Attorney attorney, String[] params);

    void delete(Attorney attorney);

}









