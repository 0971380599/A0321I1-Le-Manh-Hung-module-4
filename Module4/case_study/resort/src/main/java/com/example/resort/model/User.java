package com.example.resort.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
public class User {
    @Id
    private String username;
    private String password;

    @OneToOne(targetEntity = Employee.class)
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
