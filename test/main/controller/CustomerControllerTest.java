package main.controller;

import main.entity.Customer;
import org.junit.jupiter.api.Test;


/**
 * @author Jianning Qu
 */


import static org.junit.jupiter.api.Assertions.*;

class CustomerControllerTest {
    Customer customer = new Customer();
    CustomerController cic = new CustomerController();

    @Test
    void genCustomerTotalInfos() {
        customer.setMembershipNum("test");
        cic.genCustomerTotalInfos(customer);
        assertEquals(false, cic.findByMemberShipNum("test",
                cic.json2List(cic.readCustomerTotalInfos()))==null);
    }

    @Test
    void readCustomerTotalInfos() {
        customer.setEmail("qujianning0401@bupt.edu.cn");
        customer.setFirstName("Jianning");
        customer.setSurname("Qu");
        customer.setMobileNum("18810008025");
        customer.setStamps(5);
        cic.genCustomerTotalInfos(customer);
        System.out.println(cic.readCustomerTotalInfos() == null);
        assertEquals(false,cic.readCustomerTotalInfos() == null);
    }
    @Test
    void findByMemberShipNum(){

    }
}