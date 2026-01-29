package com.RESTAPI.REST_Template.Service.IMPL;


import com.RESTAPI.REST_Template.Model.User;
import com.RESTAPI.REST_Template.Repository.SimpleRepository;
import com.RESTAPI.REST_Template.Service.ServiceLayer;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Serviceimple implements ServiceLayer {

    private final SimpleRepository userRepository;

    public Serviceimple(SimpleRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUser(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User updateUser(Long id, User user) {

        Optional<User> existing = userRepository.findById(id);

        if (existing.isPresent()) {
            User u = existing.get();
            u.setName(user.getName());
            u.setAge(user.getAge());
            u.setEmail(user.getEmail());
            return userRepository.save(u);
        }
        return null;
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
