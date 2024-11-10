package com.example.bank;

import java.time.LocalDate;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private double salary;
    private boolean isPfOpted;
    private String department;
    private String email;
    private LocalDate dateOfBirth;

    public Employee(int id, String firstName, String lastName, double salary, boolean isPfOpted, String department, String email, LocalDate dateOfBirth, String country) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.isPfOpted = isPfOpted;
        this.department = department;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.country = country;
    }

    private String country;

    // Constructors

    public Employee() {
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isPfOpted() {
        return isPfOpted;
    }

    public void setIsPfOpted(boolean isPfOpted) {
        this.isPfOpted = isPfOpted;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", isPfOpted=" + isPfOpted +
                ", department='" + department + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", country='" + country + '\'' +
                '}';
    }
}

