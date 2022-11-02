package com.luv2code.springdemo.mvc.entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

public class Student {
    @NotNull(message = "firstName is required !")
    @Size(min = 3, message = "firstName should be at least 1 character !")
    private String firstName;
    private String lastName;
    private String country;
    private String favoriteProgrammingLanguage;
    private List<String> operatingSystems;

    public Student() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFavoriteProgrammingLanguage() {
        return favoriteProgrammingLanguage;
    }

    public void setFavoriteProgrammingLanguage(String favoriteProgrammingLanguage) {
        this.favoriteProgrammingLanguage = favoriteProgrammingLanguage;
    }

    public void setOperatingSystems(List<String> operatingSystems) {
        this.operatingSystems = operatingSystems;
    }

    public List<String> getOperatingSystems() {
        return operatingSystems;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", favoriteProgrammingLanguage='" + favoriteProgrammingLanguage + '\'' +
                ", operatingSystems=" + operatingSystems +
                '}';
    }
}
