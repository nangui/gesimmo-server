package main.java.com.nangui.services;

import main.java.com.nangui.entities.MonthYear;

import javax.ejb.Local;

@Local
public interface MonthYearService extends IDao<MonthYear, Long> {
}
