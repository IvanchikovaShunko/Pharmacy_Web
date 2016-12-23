package by.fpmi.pharmacy.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Tatiana on 02.12.2016.
 */
@Entity
@Table(name = "basket")
public class Basket implements Serializable {
    static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_basket")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idBasket;

    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinTable(name = "basket_medicine", joinColumns = {
            @JoinColumn(name = "id_basket", nullable = false)},
            inverseJoinColumns = {@JoinColumn(name = "id_medicine",
                    nullable = false)})
    private List<Medicine> medicines;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_user")
    private User idUser;


    public Basket(List<Medicine> medicines, User idUser) {
        this.medicines = medicines;
        this.idUser = idUser;
    }

    public Basket() {
        this.medicines = new ArrayList<>();
    }

    public Integer getIdBasket() {
        return idBasket;
    }

    public void setIdBasket(Integer idBasket) {
        this.idBasket = idBasket;
    }

    public List<Medicine> getMedicines() {
        return medicines;
    }

    public List<Medicine> addMedicine(Medicine medicine) {
        medicines.add(medicine);
        return medicines;
    }

    public List<Medicine> removeMedicine(Medicine medicine) {
        medicines.remove(medicine);
        return medicines;
    }

    public void setMedicines(List<Medicine> idMedicine) {
        this.medicines = idMedicine;
    }

    public User getIdUser() {
        return idUser;
    }

    public void setIdUser(User idUser) {
        this.idUser = idUser;
    }
}
