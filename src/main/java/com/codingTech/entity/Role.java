package com.codingTech.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="role_spring")

public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public String nomRole;
    @OneToMany(mappedBy = "role")
    private List<User> users;

    public Role(String nomRole) {
        this.nomRole = nomRole;
    }

    public Role(long id, String nomRole) {
        this.id = id;
        this.nomRole = nomRole;
    }

    public Role(long id, String nomRole, List<User> users) {
        this.id = id;
        this.nomRole = nomRole;
        this.users = users;
    }

    public Role(String nomRole, List<User> users) {
        this.nomRole = nomRole;
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Role() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomRole() {
        return nomRole;
    }

    public void setNomRole(String nomRole) {
        this.nomRole = nomRole;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", nomRole='" + nomRole + '\'' +
                '}';
    }
}
