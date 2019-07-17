package main.java.com.nangui.services.implementations;

import main.java.com.nangui.entities.User;
import main.java.com.nangui.services.UserService;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class UserDao implements UserService {
    @Override
    public boolean getUserByLoginAndPassword(String login, String password) {
        return false;
    }

    @Override
    public boolean add(User user) {
        return false;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public boolean update(User entity, Long id) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
