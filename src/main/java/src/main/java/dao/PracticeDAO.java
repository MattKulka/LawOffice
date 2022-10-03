package src.main.java.dao;

import src.main.java.interfaces.IPracticeDAO;
import src.main.java.model.Practice;

import java.util.List;
import java.util.Optional;

public class PracticeDAO implements IPracticeDAO {
    @Override
    public Practice getByID(long id) {
        return null;
    }

    @Override
    public void remove(long id) {

    }

    @Override
    public void create(Practice object) {

    }

    @Override
    public void update(Practice object) {

    }

    @Override
    public Optional<Practice> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<Practice> getAll() {
        return null;
    }

    @Override
    public void save(Practice practice) {

    }

    @Override
    public void update(Practice practice, String[] params) {

    }

    @Override
    public void delete(Practice practice) {

    }
}
