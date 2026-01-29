package com.RESTAPI.REST_Template.Service;


import com.RESTAPI.REST_Template.Model.User;
import org.springframework.stereotype.Service;

@Service
public interface ServiceLayer {

    User addUser(User user);
    User getUser(Long id);
    User updateUser(Long id, User user);
    void deleteUser(Long id);
}
