package com.fadtsv2.server.model;

import javax.persistence.*;
import java.io.Serializable;


@Entity //to ensure this class is map to the database
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String password;
    private String userRole;
    private int region;
    private String userNic;
    private boolean loginStatus;

    public User(){}

    public User(String name, String email, String phone, String userRole, int region, String userNic, boolean loginStatus) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.userRole = userRole;
        this.region = region;
        this.userNic = userNic;
        this.loginStatus = loginStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public int getRegion() {
        return region;
    }

    public void setRegion(int region) {
        this.region = region;
    }

    public String getUserNic() {
        return userNic;
    }

    public void setUserNic(String userNic) {
        this.userNic = userNic;
    }

    public boolean isLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(boolean loginStatus) {
        this.loginStatus = loginStatus;
    }

    @Override
    public String toString(){
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", userRole='" + userRole + '\'' +
                ", region='" + region + '\'' +
                ", userNic='" + userNic + '\'' +
                ", loginStatus='" + loginStatus + '\'' +
                '}';
    }

}
