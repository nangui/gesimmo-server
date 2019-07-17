package main.java.com.nangui.services;

import main.java.com.nangui.entities.Month;

import javax.ejb.Local;

@Local
public interface MonthService extends IDao<Month, Long> {
}
