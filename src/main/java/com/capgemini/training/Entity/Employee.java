package com.capgemini.training.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "emp_contact_number", nullable = false, length = 15)
    private String empContactNumber;

    @Column(name = "emp_name", nullable = false, length = 15)
    private String empName;

    @Column(name = "emp_email", nullable = false, unique = true, length = 100)
    private String empEmail;

    @Column(name = "emp_city", length = 50)
    private String empCity;


    public Employee() {}

    public Employee(String empContactNumber, String empEmail, String empCity) {
        this.empContactNumber = empContactNumber;
        this.empEmail = empEmail;
        this.empCity = empCity;
    }


    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getId() {
        return id;
    }

    public String getEmpContactNumber() {
        return empContactNumber;
    }

    public void setEmpContactNumber(String empContactNumber) {
        this.empContactNumber = empContactNumber;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpCity() {
        return empCity;
    }

    public void setEmpCity(String empCity) {
        this.empCity = empCity;
    }
}