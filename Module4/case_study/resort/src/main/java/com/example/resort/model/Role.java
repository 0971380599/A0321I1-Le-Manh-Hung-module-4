package com.example.resort.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Role {
    @Id
    private int roleId;
    private String roleName;
    @ManyToMany(mappedBy = "roles")
    private List<User> users;
}
