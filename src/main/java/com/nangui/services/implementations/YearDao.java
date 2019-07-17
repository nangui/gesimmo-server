package main.java.com.nangui.services.implementations;


import main.java.com.nangui.entities.Year;
import main.java.com.nangui.services.YearService;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class YearDao implements YearService {
    @Override
    public boolean add(Year year) {
        return false;
    }

    @Override
    public List<Year> getAll() {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public boolean update(Year entity, Long id) {
        return false;
    }
}
