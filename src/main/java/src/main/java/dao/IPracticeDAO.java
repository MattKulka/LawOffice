package src.main.java.dao;

import java.util.List;
import java.util.Optional;

public interface IPracticeDAO {

    public interface IPracticeDao<T> {
        Optional<Practice> get(long id);

        List<Practice> getAll();

        void save(Practice practice);

        void update(Practice practice, String[] params);

        void delete(Practice practice);
    }

}
