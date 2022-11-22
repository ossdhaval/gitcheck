package org.example.mod1;

public class Student{

    /**
     * this is Javadoc
     */
    public String firstName;
    String lastName;

//    just comments - by some other author
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