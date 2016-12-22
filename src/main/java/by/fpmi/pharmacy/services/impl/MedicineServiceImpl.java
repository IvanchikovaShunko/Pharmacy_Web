package by.fpmi.pharmacy.services.impl;

import by.fpmi.pharmacy.dao.MedicineDao;
import by.fpmi.pharmacy.model.Medicine;
import by.fpmi.pharmacy.services.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by IvanchikovaA on 16.12.2016.
 */
@Service("medicineService")
@Transactional
public class MedicineServiceImpl implements MedicineService {
    @Autowired
    MedicineDao medicineDao;

    @Override
    public Medicine getById(int id) {
        return medicineDao.getById(id);
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
        return medicineDao.listMedicines();
    }
}
