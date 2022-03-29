package com.example.resort.model;

import com.example.resort.model.Employee;
import com.example.resort.model.Role;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @Column(columnDefinition = "VARCHAR(45)")
    private String username;
    private String password;

    @OneToOne(mappedBy = "user")
    private Employee employee;

    @ManyToMany(mappedBy = "users")
    private List<Role> roles;

    public User() {
    }

    public User(String username, String password, Employee employee, List<Role> roles) {
        this.username = username;
        this.password = password;
        this.employee = employee;
        this.roles = roles;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
