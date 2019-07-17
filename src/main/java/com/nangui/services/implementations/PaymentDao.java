package main.java.com.nangui.services.implementations;

import main.java.com.nangui.entities.Payment;
import main.java.com.nangui.services.PaymentService;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class PaymentDao implements PaymentService {
    @Override
    public boolean add(Payment payment) {
        return false;
    }

    @Override
    public List<Payment> getAll() {
        return null;
    }

    @Override
    public boolean update(Payment entity, Long id) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
