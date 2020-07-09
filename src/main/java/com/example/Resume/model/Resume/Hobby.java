package com.example.Resume.model.Resume;

import com.example.Resume.model.User;

import javax.persistence.*;

@Entity
@Table(name = "hobby")
public class Hobby {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
    private String name;
    @OneToOne(mappedBy = "hobby",cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private User user;
    public Hobby(){}

    public Hobby( String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
