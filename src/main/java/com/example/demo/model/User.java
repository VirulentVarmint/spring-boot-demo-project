package com.example.demo.model;

import lombok.*;

@Data
public class User {

    private static int idTracker = 0;

    private int id;
    private String name;
    private String lastName;
    private String mobile;

    public User() {
        this.id = ++idTracker;
        this.name = "";
        this.lastName = "";
        this.mobile = "";
    }

    public User(String name, String lastName, String mobile) {
        this.id = ++idTracker;
        this.name = name;
        this.lastName = lastName;
        this.mobile = mobile;
    }

    public void setIdTracker(int id) {
        idTracker = id;
    }

    public void updateUser(User user) {
        this.name = user.name;
        this.lastName = user.lastName;
        this.mobile = user.mobile;
    }

}
