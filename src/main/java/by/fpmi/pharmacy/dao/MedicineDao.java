package by.fpmi.pharmacy.dao;

import by.fpmi.pharmacy.model.Medicine;

import java.util.List;

/**
 * Created by IvanchikovaA on 09.12.2016.
 */
public interface  MedicineDao {
        Medicine getById(int id);
        void update(Medicine medicine);
        Medicine save(Medicine medicine);
        void delete(int id);
        List<Medicine> listMedicines();
}
