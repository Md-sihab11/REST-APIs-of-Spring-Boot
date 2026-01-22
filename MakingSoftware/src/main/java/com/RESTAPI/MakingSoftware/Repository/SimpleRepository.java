package com.RESTAPI.MakingSoftware.Repository;

import com.RESTAPI.MakingSoftware.DTO.UserRequestDto;
import com.RESTAPI.MakingSoftware.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SimpleRepository extends JpaRepository<User, Integer> {
    User findByName(String name);
    //all the queries are here
}
