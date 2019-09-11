package production;
/*
Author: Andrew Mirauta
Date: 9/9/2019
Program: A program that creates a customer or agent object from a person template
 */
import model.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayrolltestTest {

    @Test
    void makePhoneBook() {//tester to see if a customer object is equal to another
        Customer c = new Customer("Tom", "T", "Brady");
        Assertions.assertEquals("Brady, Tom T.", c.makePhoneBookName());
    }
}