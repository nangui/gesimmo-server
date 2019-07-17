package main.java.com.nangui.services;

import main.java.com.nangui.entities.Customer;

import javax.ejb.Local;

@Local
public interface CustomerService extends IDao<Customer, Long> {
}
