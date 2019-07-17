package main.java.com.nangui.services.implementations;

import main.java.com.nangui.entities.MonthYear;
import main.java.com.nangui.services.MonthYearService;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class MonthYearDao implements MonthYearService {
    @Override
    public boolean add(MonthYear monthYear) {
        return false;
    }

    @Override
    public List<MonthYear> getAll() {
        return null;
    }

    @Override
    public boolean update(MonthYear entity, Long id) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
