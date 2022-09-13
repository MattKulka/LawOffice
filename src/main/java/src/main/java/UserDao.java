package src.main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class UserDao implements Dao<src.main.java.User>{

    private final List<src.main.java.User> users = new ArrayList<>();

    public UserDao() {
        users.add(new src.main.java.User("John", "john@domain.com"));
        users.add(new src.main.java.User("Susan", "susan@domain.com"));
    }

    @Override
    public Optional<src.main.java.User> get(long id) {
        return Optional.ofNullable(users.get((int) id));
    }

    @Override
    public List<src.main.java.User> getAll() {
        return users;
    }

    @Override
    public void save(src.main.java.User user) {
        users.add(user);
    }

    @Override
    public void update(src.main.java.User user, String[] params) {
        user.setName(Objects.requireNonNull(
                params[0], "Name cannot be null"));
        user.setEmail(Objects.requireNonNull(
                params[1], "Email cannot be null"));

        users.add(user);
    }

    @Override
    public void delete(src.main.java.User user) {
        users.remove(user);
    }

}
