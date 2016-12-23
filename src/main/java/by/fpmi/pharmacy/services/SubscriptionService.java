package by.fpmi.pharmacy.services;

import by.fpmi.pharmacy.model.Subscription;

import java.util.List;

/**
 * Created by IvanchikovaA on 23.12.2016.
 */
public interface SubscriptionService {
    Subscription getById(int id);
    List<Subscription> getUserSubscriptions(int userId);
    Subscription getByUserId(int userId);
    void update(Subscription subscription);
    Subscription save(Subscription subscription);
    void delete(int id);
}
