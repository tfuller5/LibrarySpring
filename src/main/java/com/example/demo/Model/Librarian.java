package com.example.demo.Model;

public class Librarian {
    private String name;
    private String gender;
    private String username;
    private String password;

    public Librarian(String name, String gender, String username, String password) {
        // this replicates the setter
        this.name = name;
        this.gender = gender;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
