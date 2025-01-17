package app.service;


import app.model.Users.User;
import app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceInterface implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(String code, User user) {
        return null;
    }

    @Override
    public void delete(String name) {

    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public List<User> findByName(String userName) {
        return userRepository.findByName(userName);
    }

}