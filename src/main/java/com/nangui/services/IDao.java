package main.java.com.nangui.services;

import java.util.List;

public interface IDao<T, U> {
    boolean add(T t);

    List<T> getAll();

    boolean delete(U id);

    boolean update(T entity, U id);
}
