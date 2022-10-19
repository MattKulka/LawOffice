package src.main.java.dao;

import src.main.java.interfaces.IUserDAO;
import src.main.java.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class UserDao implements IUserDAO{

    private final List<User> users = new ArrayList<>();

    public UserDao() {
        users.add(new User("Matt", "Matt@domain.com"));
        users.add(new User("Sarah", "Sarah@domain.com"));
    }

    @Override
    public Optional<User> get(long id) {
        return Optional.ofNullable(users.get((int) id));
    }

    @Override
    public List<User> getAll() {
        return users;
    }

    @Override
    public void save(User user) {
        users.add(user);
    }

    @Override
    public void update(User user, String[] params) {
        user.setName(Objects.requireNonNull(
                params[0], "Name cannot be null"));
        user.setEmail(Objects.requireNonNull(
                params[1], "Email cannot be null"));

        users.add(user);
    }

    @Override
    public void delete(User user) {
        users.remove(user);
    }

    @Override
    public User getByID(long id) {
        return null;
    }

    @Override
    public void remove(long id) {

    }

    @Override
    public void create(User object) {

    }

    @Override
    public void update(User object) {

    }
}
