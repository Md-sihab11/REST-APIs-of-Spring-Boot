package com.RESTAPI.REST_Template.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "users") //auto table create kore nibe
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long voterId;

    String name;

    int age;

    String email;
    //setter and getter

    public Long getVoterId() {
        return voterId;
    }

    public void setVoterId(Long voterId) {
        this.voterId = voterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
