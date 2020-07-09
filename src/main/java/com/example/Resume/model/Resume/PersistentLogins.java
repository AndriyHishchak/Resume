package com.example.Resume.model.Resume;

import com.example.Resume.model.User;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "persistentLogins")
public class PersistentLogins {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
    private String username;
    private String series;
    private String token;
    @OneToOne(mappedBy = "persistentLogins",cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private User user;
    public PersistentLogins(){}

    public PersistentLogins(String username, String series, String token, Date last_used) {
        this.username = username;
        this.series = series;
        this.token = token;

    }

    public String getUsername() {
        return username;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSeries() {
        return series;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }


}
