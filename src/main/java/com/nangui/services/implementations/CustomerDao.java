package main.java.com.nangui.services.implementations;

import main.java.com.nangui.entities.Customer;
import main.java.com.nangui.services.CustomerService;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class CustomerDao implements CustomerService {
    @Override
    public boolean add(Customer customer) {
        return false;
    }

    @Override
    public List<Customer> getAll() {
        return null;
    }

    @Override
    public boolean update(Customer entity, Long id) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
