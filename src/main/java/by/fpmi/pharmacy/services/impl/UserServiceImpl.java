package by.fpmi.pharmacy.services.impl;

import by.fpmi.pharmacy.dao.UserDao;
import by.fpmi.pharmacy.model.User;
import by.fpmi.pharmacy.services.UserService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by IvanchikovaA on 09.12.2016.
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;



    @Override
    public User readUserByUsername(String username) {
        return userDao.getByUsername(username);
    }

    @Override
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public User save(User user) {
        return userDao.save(user);
    }

    @Override
    public void delete(String username) {
        userDao.delete(username);
    }

    private boolean usernameExists(final String name) {
        final User user = userDao.getByUsername(name);
        return user != null;
    }

    @Override
    public User registerNewUserAccount(User accountDto) throws NullPointerException {
//        if (usernameExists(accountDto.getUsername())) {
//            throw new NullPointerException("Account with that username: " + accountDto.getUsername() + " already exists!");
//        }
//        final User user = new User();
//        user.setUsername(accountDto.getUsername());
//        user.setPassword(new CustomPasswordEncoder("sha-256").encodePassword(accountDto.getPassword(), accountDto.getUsername()));
//        user.setEnabled(true);
//        user.setFirstname(accountDto.getFirstname());
//        user.setLastname(accountDto.getLastname());
//        //user.getUserRolesSet().add(new UserRole(user, "USER"));
//        return userDao.save(user);
        return accountDto;
    }

    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }

    @Override
    public User find(String login, String password) {
        return userDao.find(login, password);
    }



}
