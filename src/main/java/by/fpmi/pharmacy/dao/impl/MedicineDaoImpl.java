package by.fpmi.pharmacy.dao.impl;

import by.fpmi.pharmacy.dao.MedicineDao;
import by.fpmi.pharmacy.model.Medicine;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by IvanchikovaA on 16.12.2016.
 */
@Repository
public class MedicineDaoImpl implements MedicineDao{

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public Medicine getById(int id) {
        return null;
    }

    @Override
    public void update(Medicine medicine) {

    }

    @Override
    public Medicine save(Medicine medicine) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Medicine> listMedicines() {
        Criteria c = sessionFactory.getCurrentSession().createCriteria(Medicine.class);
        c.addOrder(Order.asc("nameMedicine"));
        return c.list();
    }
}
