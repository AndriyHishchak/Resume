package com.example.Resume.model.Resume;



import com.example.Resume.model.User;

import javax.persistence.*;

@Entity
@Table(name = "certificate")
public class Certificate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String large_url;
    private String small_url;
    @OneToOne(mappedBy = "certificate",cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private User user;
    public Certificate(){}

    public Certificate(String name, String large_url, String small_url) {
        this.name = name;
        this.large_url = large_url;
        this.small_url = small_url;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public String getLarge_url() {
        return large_url;
    }

    public void setLarge_url(String large_url) {
        this.large_url = large_url;
    }

    public String getSmall_url() {
        return small_url;
    }

    public void setSmall_url(String small_url) {
        this.small_url = small_url;
    }
}
