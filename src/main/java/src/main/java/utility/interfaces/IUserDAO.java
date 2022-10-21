package src.main.java.utility.interfaces;

import src.main.java.model.User;

import java.util.List;
import java.util.Optional;

public interface IUserDAO extends IBaseDAO<User> {
    Optional<User> get(long id);

    List<User> getAll();

    void save(User user);

    void update(User user, String[] params);

    void delete(User user);
}
