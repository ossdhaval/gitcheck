package org.example.mod1;

public class Student{

    String firstName;
    String lastName;

//    just comments
    public String getFullName()
    {
        return firstName+" "+lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}