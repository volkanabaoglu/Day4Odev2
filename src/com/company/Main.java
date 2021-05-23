package com.company;

public class Main {

    public static void main(String[] args) {
        Customer customer1 =new Customer();
        customer1.setFirstName("Volkan");
        BaseCustomerManager customerManager = new NeroCustomerManager();
        customerManager.save(customer1);
    }
}
