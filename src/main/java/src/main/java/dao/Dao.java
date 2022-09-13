package src.main.java.dao;

import src.main.java.dao.User;

import java.util.List;
import java.util.Optional;

public interface Dao<T> {
    Optional<User> get(long id);

    List<User> getAll();

    void save(User user);

    void update(User user, String[] params);

    void delete(User user);
}
