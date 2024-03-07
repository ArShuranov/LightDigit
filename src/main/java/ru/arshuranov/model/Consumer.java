package ru.arshuranov.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;
import java.util.Objects;

@Entity
public class Consumer {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String phone;
    private Role role;
    private String login;
    private String password;

    //@JsonIgnore
    @OneToMany(mappedBy = "consumer")
    private List<Request> requests;


    public Consumer() {
    }

    public Consumer(long id, String name, String phone, Role role, String login, String password) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.role = role;
        this.login = login;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Consumer consumer = (Consumer) o;
        return id == consumer.id && Objects.equals(name, consumer.name) && Objects.equals(phone, consumer.phone) && role == consumer.role && Objects.equals(login, consumer.login) && Objects.equals(password, consumer.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, phone, role, login, password);
    }
}
