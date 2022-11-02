package com.luv2code.springdemo.mvc.entity.customer;

import javax.validation.constraints.*;

public class Customer {
    @NotEmpty(message = "Required field !")
    private String name;
    @NotNull(message = "Required field !")
    private String surname;
    @Pattern(regexp = "\\S+@\\S+\\.\\S+", message = "Check your email again !")
    //@Email can be used actually
    private String email;
    @NotNull(message = "Age is required.")
    @Min(value = 18, message = "You should be 18 years or older to be a customer !")
    private Integer age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
