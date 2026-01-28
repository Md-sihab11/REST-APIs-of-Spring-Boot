package com.RESTAPI.REST_Template.Model;

import jakarta.persistence.*;

@Entity  //→ tells JPA/Hibernate that this class represents a table in the database.
@Table(name = "users") //auto table create kore nibe
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Voter_ID")
    private Long voterId;

    //nullable = false → this field cannot be null (required field)
    //unique = true → only unique values allowed in this column
    //length = 100 → maximum characters for String columns
    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false)
    private int age;

    @Column(nullable = false,unique = true, length = 150)
    private String email;
//field access modifier here is private


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
