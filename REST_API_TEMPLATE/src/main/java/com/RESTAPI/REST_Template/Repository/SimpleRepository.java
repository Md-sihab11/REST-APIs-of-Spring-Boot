package com.RESTAPI.REST_Template.Repository;


import com.RESTAPI.REST_Template.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SimpleRepository extends JpaRepository<User, Long> {

}
