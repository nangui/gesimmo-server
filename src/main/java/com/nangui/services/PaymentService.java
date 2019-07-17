package main.java.com.nangui.services;

import main.java.com.nangui.entities.Payment;

import javax.ejb.Local;

@Local
public interface PaymentService extends IDao<Payment, Long> {
}
