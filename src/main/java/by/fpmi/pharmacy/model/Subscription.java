package by.fpmi.pharmacy.model;


import javax.persistence.*;
import java.sql.Date;
import java.util.Set;


@Entity
@Table(name = "subscription")
public class Subscription {
    @Id
    @Column(name = "id_subscription")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSubscription;

    @Column(name = "subscription")
    private Boolean subscription;

    @Column(name = "subscription_period")
    private Integer subscriptionPeriod;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_medicine")
    private Medicine idMedicine;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_user")
    private User idUser;



    public Subscription(){}

    public Integer getIdSubscription() {
        return idSubscription;
    }

    public void setIdSubscription(Integer idSubscription) {
        this.idSubscription = idSubscription;
    }

    public Boolean getSubscription() {
        return subscription;
    }

    public void setSubscription(Boolean subscription) {
        this.subscription = subscription;
    }

    public Integer getSubscriptionPeriod() {
        return subscriptionPeriod;
    }

    public void setSubscriptionPeriod(Integer subscriptionPeriod) {
        this.subscriptionPeriod = subscriptionPeriod;
    }

    public Medicine getIdMedicine() {
        return idMedicine;
    }

    public void setIdMedicine(Medicine idMedicine) {
        this.idMedicine = idMedicine;
    }

    public User getIdUser() {
        return idUser;
    }

    public void setIdUser(User idUser) {
        this.idUser = idUser;
    }
}
