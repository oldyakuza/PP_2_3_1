package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void add(User user);

    void remove(long id);

    User getUserById(long id);

    void update(long id, User user);
}
