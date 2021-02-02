package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {
    private String firstname;
    private String lastname;
    private String schoolName;

    public Principal(String firstname, String lastname, String schoolName) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.schoolName = schoolName;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getSchoolName() {
        return schoolName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Principal)) return false;
        Principal principal = (Principal) o;
        return Objects.equals(getFirstname(), principal.getFirstname()) && Objects.equals(getLastname(), principal.getLastname()) && Objects.equals(getSchoolName(), principal.getSchoolName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstname(), getLastname(), getSchoolName());
    }

    @Override
    public String toString() {
        return "Principal{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
