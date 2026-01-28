package com.RESTAPI.MakingSoftware.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class UserRequestDto {

    @NotBlank(message="Name is required")
    private String name;

    @Min(value = 14, message = "Age should be 14 at least 14")
    @Max(value=20,message="MAX 20 Bro!!" )
    private int age;

    @NotBlank(message = "An valid Email is required")
    @Email(message = "Invalid ,It should be as a example abc@xyz.com")
    private String email;

    //Setter and getter
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public int getAge()
    {
        return age;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    public String getEmail()
    {
        return email;
    }
}
