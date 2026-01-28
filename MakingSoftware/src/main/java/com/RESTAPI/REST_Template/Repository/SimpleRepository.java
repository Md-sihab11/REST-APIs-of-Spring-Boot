package com.RESTAPI.REST_Template.Repository;

import com.RESTAPI.REST_Template.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SimpleRepository extends JpaRepository<User, Integer> {
    User findByName(String name);
    //all the queries are here
}
