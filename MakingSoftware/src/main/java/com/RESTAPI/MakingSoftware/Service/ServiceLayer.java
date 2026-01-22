package com.RESTAPI.MakingSoftware.Service;

import com.RESTAPI.MakingSoftware.DTO.UserRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface ServiceLayer {

    String hello();

    ResponseEntity<UserRequestDto> getUser(int id);
    ResponseEntity<UserRequestDto> search(String name);
    ResponseEntity<UserRequestDto> add(UserRequestDto dto);
    ResponseEntity<UserRequestDto> update(int id, UserRequestDto dto);
    ResponseEntity<UserRequestDto> delete(int id);
    //String addUser(UserRequestDto dto);   // Service only sees DTO
}
