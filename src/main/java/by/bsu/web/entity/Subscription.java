package by.bsu.web.entity;


import javax.persistence.*;
import java.util.Set;

/**
 * Created by Tatiana on 02.12.2016.
 */
public class Subscription {
    @Id
    @Column(name = "id_subscription")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSubscription;

    @Column(name = "subscription")
    private Boolean subscription;

    @Column(name = "subscription_period")
    private String subscriptionPeriod;


    @OneToMany(mappedBy = "id_medicine")
    private Set<Medicine> idMedicine;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_user")
    private User idUser;


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

    public String getSubscriptionPeriod() {
        return subscriptionPeriod;
    }

    public void setSubscriptionPeriod(String subscriptionPeriod) {
        this.subscriptionPeriod = subscriptionPeriod;
    }

    public Set<Medicine> getIdMedicine() {
        return idMedicine;
    }

    public void setIdMedicine(Set<Medicine> idMedicine) {
        this.idMedicine = idMedicine;
    }

    public User getIdUser() {
        return idUser;
    }

    public void setIdUser(User idUser) {
        this.idUser = idUser;
    }
}
