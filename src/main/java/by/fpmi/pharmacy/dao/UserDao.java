package by.fpmi.pharmacy.dao;

import by.fpmi.pharmacy.model.User;
import java.util.List;

/**
 * Created by IvanchikovaA on 09.12.2016.
 */


public interface UserDao {
    User getByUsername(String username);
    User getUserById(int id);
    void update(User user);
    User save(User user);
    void delete(String username);
    List<User> listUsers();

    User find(String login, String password);

}