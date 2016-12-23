package by.fpmi.pharmacy.services.impl;

import by.fpmi.pharmacy.dao.UserDetailsDao;
import by.fpmi.pharmacy.model.UserDetail;
import by.fpmi.pharmacy.services.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by IvanchikovaA on 23.12.2016.
 */
@Service("userServiceDetails")
@Transactional
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UserDetailsDao userDetailsDao;

    @Override
    public UserDetail getUserById(int id) {
        return userDetailsDao.getUserById(id);
    }
}
