package web.service;

import org.springframework.stereotype.Service;
import web.model.User;
import web.repository.UserRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.listAll();
    }

    @Override
    public void add(User user) {
        userRepository.add(user);
    }

    @Override
    public void remove(long id) {
        userRepository.remove(id);
    }

    @Override
    public User getUserById(long id){
        return userRepository.getUserById(id);
    }

    @Override
    public void update(long id, User user) {
        userRepository.update(id, user);
    }
}
