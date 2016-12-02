package by.bsu.web.entity;



import javax.persistence.*;

/**
 * Created by Tatiana on 02.12.2016.
 */
@Entity
@Table(name = "user")
class User {
    @Id
    @Column(name = "id_user", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUser;


    @Column(name = "password")
    private String password;

    @Column(name = "login")
    private String login;

    @Column(name = "role")
    private String role;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_user_det")
    private UserDet idUserDet;


    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public UserDet getIdUserDet() {
        return idUserDet;
    }

    public void setIdUserDet(UserDet idUserDet) {
        this.idUserDet = idUserDet;
    }
}
