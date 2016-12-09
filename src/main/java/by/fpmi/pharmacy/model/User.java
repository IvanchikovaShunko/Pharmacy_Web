package by.fpmi.pharmacy.model;



import javax.persistence.*;

/**
 * Created by Tatiana on 02.12.2016.
 */
@Entity
@Table(name = "user")
public class User {
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
    private UserDetail idUserDetail;


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

    public UserDetail getIdUserDetail() {
        return idUserDetail;
    }

    public void setIdUserDetail(UserDetail idUserDetail) {
        this.idUserDetail = idUserDetail;
    }
}
