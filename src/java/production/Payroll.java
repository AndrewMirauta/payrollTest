package production;
/*
Author: Andrew Mirauta
Date: 9/9/2019
Program: A program that creates a customer or agent object from a person template
 */
import model.Customer;

public class Payroll {//payroll class
    public static void main(String[] args) {

        Customer customers[] = new Customer[5];//array creation
        System.out.println("We currently have " + customers.length + " customers");//prints array length and customers

        customers[0] = new Customer("Ryan", "G", "Bonnel"); //customer creation x 3
        customers[1] = new Customer("Pollo","El","Loco");
        customers[2] = new Customer("Doug", "D", "Douglas");

        try {//if a customer exists, print it
            for (int i = 0; i < customers.length; i++) {
                System.out.println(customers[i].makePhoneBookName());
            }
        }
        catch (Exception e){//if no more customers, let user know
            System.out.println("No further customers");
        }
    }
}
