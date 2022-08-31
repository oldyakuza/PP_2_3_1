package web.repository;

import web.model.User;

import java.util.List;


public interface UserRepository { //extends JpaRepository
    List<User> listAll();
    void add(User user);
    void remove(long id);

    User getUserById(long id);

    void update(long id, User user);
}
