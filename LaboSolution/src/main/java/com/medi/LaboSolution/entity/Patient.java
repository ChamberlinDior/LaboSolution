package com.medi.LaboSolution.entity;

import jakarta.persistence.*;


import java.time.LocalDate;

@Entity
@Table(name = "patients")
public class Patient {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "gender")
    private String gender;

    @Column(name = "address")
    private String address;

    @Column(name = "email")
    private String email;

    public Patient(){

    }

    public Patient(String lastName, String firstName, String email, String address, String gender, LocalDate dateOfBirth) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address =address;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;

    }

    public Patient(String firstName, String lastName, LocalDate dateOfBirth, String gender, String address, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.address = address;
        this.email = email;
    }



    public Long getId() {
        return id;



    }

    public void setId(Long id) {
        this.id = id;
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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
