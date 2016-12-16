package by.fpmi.pharmacy.services;

import by.fpmi.pharmacy.model.Medicine;

import java.util.List;

/**
 * Created by IvanchikovaA on 16.12.2016.
 */
public interface MedicineService {
    Medicine getById(int id);
    void update(Medicine medicine);
    Medicine save(Medicine medicine);
    void delete(int id);
    List<Medicine> listMedicines();
}
