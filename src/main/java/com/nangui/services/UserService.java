package main.java.com.nangui.services;

import main.java.com.nangui.entities.User;

import javax.ejb.Local;

@Local
public interface UserService extends IDao<User, Long> {
    boolean getUserByLoginAndPassword(String login, String password);
}
