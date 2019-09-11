package model;
/*
Author: Andrew Mirauta
Date: 9/9/2019
Program: A program that creates a customer or agent object from a person template
 */
import java.util.Objects;

public class Customer extends Person {//customer class extending person properties for a name
    private String custAddress; //customer properties beyond name
    private String custCity;
    private String custProv;

    public Customer(String firstName, String middleInitial, String lastName, //full customer constructor
                    String custAddress, String custCity, String custProv) {
        super(firstName, middleInitial, lastName);
        this.custAddress = custAddress;
        this.custCity = custCity;
        this.custProv = custProv;
    }

    public Customer(String firstName, String middleInitial, String lastName) {
        super(firstName, middleInitial, lastName);//a different simpler constructor
    }

    @Override
    public void display() {
        System.out.println("Customer{" +
                "custFirstName='" + getFirstName() + '\'' +
                ", custMiddleInitial='" + getMiddleInitial() + '\'' +
                ", custLastName='" + getLastName() + '\'' +
                ", custAddress='" + custAddress + '\'' +
                ", custCity='" + custCity + '\'' +
                ", custProv='" + custProv + '\'' +
                '}');
    }

    public String getCustAddress() {
        return custAddress;
    } //getters and setters for all properties

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public String getCustCity() {
        return custCity;
    }

    public void setCustCity(String custCity) {
        this.custCity = custCity;
    }

    public String getCustProv() {
        return custProv;
    }

    public void setCustProv(String custProv) {
        this.custProv = custProv;
    }

    @Override
    public String toString() {//to print out a full customer
        return "Customer{" +
                "custFirstName='" + getFirstName() + '\'' +
                ", custMiddleInitial='" + getMiddleInitial() + '\'' +
                ", custLastName='" + getLastName() + '\'' +
                ", custAddress='" + custAddress + '\'' +
                ", custCity='" + custCity + '\'' +
                ", custProv='" + custProv + '\'' +
                '}';
    }

    @Override //shows if one customer is equal to another for testing
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return Objects.equals(getFirstName(), customer.getFirstName()) &&
                Objects.equals(getMiddleInitial(), customer.getMiddleInitial()) &&
                Objects.equals(getLastName(), customer.getLastName()) &&
                Objects.equals(getCustAddress(), customer.getCustAddress()) &&
                Objects.equals(getCustCity(), customer.getCustCity()) &&
                Objects.equals(getCustProv(), customer.getCustProv());
    }


}