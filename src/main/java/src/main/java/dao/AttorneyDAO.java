package src.main.java.dao;

import src.main.java.utils.interfaces.IAttorneyDAO;
import src.main.java.model.Attorney;

import java.util.List;
import java.util.Optional;

public class AttorneyDAO implements IAttorneyDAO {
    @Override
    public Optional<Attorney> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<Attorney> getAll() {
        return null;
    }

    @Override
    public void save(Attorney attorney) {

    }

    @Override
    public void update(Attorney attorney, String[] params) {

    }

    @Override
    public void delete(Attorney attorney) {

    }

    @Override
    public Attorney getByID(long id) {
        return null;
    }

    @Override
    public void remove(long id) {

    }

    @Override
    public void create(Attorney object) {

    }

    @Override
    public void update(Attorney object) {

    }
}
