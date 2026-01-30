package com.RESTAPI.REST_Template.Repository;


import com.RESTAPI.REST_Template.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SimpleRepository extends JpaRepository<User, Long> {

/*SimpleRepository repo = new SimpleRepositoryImpl(); springBoot runtime e
proxy ayrokom class banay and jpa er method gula implements kore
   save()
   findById()
   findAll()
   deleteById()
   existsById()
   count()
*/

}
