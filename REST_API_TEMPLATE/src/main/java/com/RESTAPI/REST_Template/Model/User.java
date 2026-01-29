package com.RESTAPI.REST_Template.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "voter_id")
    private Long voterId;

    @NotBlank(message = "Name is required")
    @Size(max = 100, message = "Name must be at most 100 characters")
    @Column(nullable = false, length = 100)
    private String name;

    @Min(value = 18, message = "Age must be at least 18")
    @Max(value = 120, message = "Age must be realistic")
    @Column(nullable = false)
    private int age;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    @Size(max = 150)
    @Column(nullable = false, unique = true, length = 150)
    private String email;

    // 🔹 No-args constructor (required by JPA)
    public User() {
    }

    // 🔹 Parameterized constructor (NO ID)
    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // 🔹 Getters & Setters
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

    // 🔹 toString (safe for logs)
    @Override
    public String toString() {
        return "User{" +
                "voterId=" + voterId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
