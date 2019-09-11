package model;
/*
Author: Andrew Mirauta
Date: 9/9/2019
Program: A program that creates a customer or agent object from a person template
 */
public class Agents extends Person {//person class that can be a parent for name values
    public Agents(String firstName, String middleInitial, String lastName) {
        super(firstName, middleInitial, lastName);
    }

    @Override //toString for Agent class
    public void display() {
        System.out.println("Customer{" +
                "custFirstName='" + getFirstName() + '\'' +
                ", custMiddleInitial='" + getMiddleInitial() + '\'' +
                ", custLastName='" + getLastName() + "\'}");
    }
}
