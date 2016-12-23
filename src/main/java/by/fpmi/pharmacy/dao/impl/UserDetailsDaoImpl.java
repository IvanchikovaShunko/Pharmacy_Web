package by.fpmi.pharmacy.dao.impl;

import by.fpmi.pharmacy.dao.UserDetailsDao;
import by.fpmi.pharmacy.model.User;
import by.fpmi.pharmacy.model.UserDetail;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by IvanchikovaA on 23.12.2016.
 */
@Repository
public class UserDetailsDaoImpl implements UserDetailsDao {
    private static String GET_USER_BY_ID = "FROM UserDetail WHERE idUserDet=:idUserDet";

    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public UserDetail getUserById(int id) {
        List users = sessionFactory.getCurrentSession().createQuery(GET_USER_BY_ID)
                .setParameter("idUserDet", id).list();
        if (users.size() > 0) {
            return (UserDetail) users.get(0);
        } else {
            return null;
        }
    }
}
