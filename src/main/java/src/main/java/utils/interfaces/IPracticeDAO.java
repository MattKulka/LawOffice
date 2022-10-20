package src.main.java.utils.interfaces;

import src.main.java.model.Practice;

import java.util.List;
import java.util.Optional;

public interface IPracticeDAO extends IBaseDAO<Practice> {

    Optional<Practice> get(long id);

    List<Practice> getAll();

    void save(Practice practice);

    void update(Practice practice, String[] params);

    void delete(Practice practice);


    }


