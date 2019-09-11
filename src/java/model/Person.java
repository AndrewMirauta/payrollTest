package model;
/*
Author: Andrew Mirauta
Date: 9/9/2019
Program: A program that creates a customer or agent object from a person template
 */
public class Person {//a parent class that can be extended for person creation
    private String firstName;
    protected String middleInitial;
    protected String lastName;

    public Person(String firstName, String middleInitial, String lastName) { //person  constructor
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
    }

    public void display() {
    }

    public String getFirstName() {
        return firstName;
    } //getters and setters

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String makePhoneBookName() {
        return getLastName() + ", " + getFirstName() + " " + getMiddleInitial() + ".";
    }
}
