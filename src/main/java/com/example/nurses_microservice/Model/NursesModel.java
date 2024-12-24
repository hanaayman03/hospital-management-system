package com.example.nurses_microservice.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "nurses")
public class NursesModel {
    @Id
    private String id;
    private String name;
    private String gender;
    private Date dateOfBirth;
    private String address;
    private String phone;
    private String email;
    private String assignedDr;
    private Double salary;
    private String workSchedule;
    private String department;

    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setAssignedDr(String assignedDr) {
        this.assignedDr = assignedDr;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public void setWorkSchedule(String workSchedule) {
        this.workSchedule = workSchedule;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public String getAddress() {
        return address;
    }
    public String getPhone() {
        return phone;
    }
    public String getEmail() {
        return email;
    }
    public String getAssignedDr() {
        return assignedDr;
    }
    public Double getSalary() {
        return salary;
    }
    public String getWorkSchedule() {
        return workSchedule;
    }
    public String getDepartment() {
        return department;
    }

}

