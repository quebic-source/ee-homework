package com.ee.homework.model;

import java.util.Objects;

public class User {
    private String email;
    private String firstName;
    private String lastName;

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(firstName + lastName, user.firstName + user.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName + lastName);
    }
}
