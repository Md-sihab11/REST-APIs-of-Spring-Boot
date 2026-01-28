package com.RESTAPI.MakingSoftware.Service.IMPL;

import com.RESTAPI.MakingSoftware.DTO.UserRequestDto;
import com.RESTAPI.MakingSoftware.Model.User;
import com.RESTAPI.MakingSoftware.Repository.SimpleRepository;
import com.RESTAPI.MakingSoftware.Service.ServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class Serviceimple implements ServiceLayer {

    @Autowired
    private SimpleRepository simpleRepository;

    @Override
    public String hello() {
        return "hello, I am from Service Layer";
    }

    @Override
    public ResponseEntity<UserRequestDto> getUser(int id) {

        User user = simpleRepository.findById(id).orElse(null);

        if (user == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        UserRequestDto dto = new UserRequestDto();
        dto.setName(user.getName());
        dto.setAge(user.getAge());
        dto.setEmail(user.getEmail());

        return ResponseEntity.ok(dto);
    }

    @Override
    public ResponseEntity<UserRequestDto> add(UserRequestDto dto) {

        User user = new User();
        user.setName(dto.getName());
        user.setAge(dto.getAge());
        user.setEmail(dto.getEmail());

        User savedUser = simpleRepository.save(user);

        UserRequestDto res = new UserRequestDto();
        res.setName(savedUser.getName());
        res.setAge(savedUser.getAge());
        res.setEmail(savedUser.getEmail());

        return ResponseEntity.status(HttpStatus.CREATED).body(res);
    }

    @Override
    public ResponseEntity<UserRequestDto> delete(int id) {

        if (!simpleRepository.existsById(id)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        simpleRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<UserRequestDto> search(String name) {

        User user = simpleRepository.findByName(name);

        if (user == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        UserRequestDto dto = new UserRequestDto();
        dto.setName(user.getName());
        dto.setAge(user.getAge());
        dto.setEmail(user.getEmail());

        return ResponseEntity.ok(dto);
    }

    @Override
    public ResponseEntity<UserRequestDto> update(int id, UserRequestDto dto) {

        User user = simpleRepository.findById(id).orElse(null);

        if (user == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        user.setName(dto.getName());
        user.setAge(dto.getAge());
        user.setEmail(dto.getEmail());

        User updated = simpleRepository.save(user);

        UserRequestDto res = new UserRequestDto();
        res.setName(updated.getName());
        res.setAge(updated.getAge());
        res.setEmail(updated.getEmail());

        return ResponseEntity.ok(res);
    }
}
