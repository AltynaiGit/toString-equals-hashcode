package org.example;

import java.util.Objects;

public class User {
    String email;
    int password;
    String name;

    public User(String email, int password, String name) {
        this.email = email;
        this.password = password;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {

        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return password == user.password && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, password, name);
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password=" + password +
                ", name='" + name + '\'' +
                '}';
    }
}
