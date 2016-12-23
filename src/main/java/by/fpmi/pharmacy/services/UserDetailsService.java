package by.fpmi.pharmacy.services;

import by.fpmi.pharmacy.model.User;
import by.fpmi.pharmacy.model.UserDetail;

/**
 * Created by IvanchikovaA on 23.12.2016.
 */
public interface UserDetailsService {
    UserDetail getUserById(int id);
}
