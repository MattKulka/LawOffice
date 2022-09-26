package src.main.java.dao;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;

public interface IAttorneyDAO {

    Optional<Attorney> get(long id);

    List<Attorney> getAll();

    void save(Attorney attorney);

    void update(Attorney attorney, String[] params);

    void delete(Attorney attorney);

}









