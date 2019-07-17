package main.java.com.nangui.services;

import main.java.com.nangui.entities.Year;

import javax.ejb.Local;

@Local
public interface YearService extends IDao<Year, Long> {
}
