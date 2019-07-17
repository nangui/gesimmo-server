package main.java.com.nangui.services.implementations;

import main.java.com.nangui.entities.Month;
import main.java.com.nangui.services.MonthService;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class MonthDao implements MonthService {
    @Override
    public boolean add(Month month) {
        return false;
    }

    @Override
    public List<Month> getAll() {
        return null;
    }

    @Override
    public boolean update(Month entity, Long id) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
