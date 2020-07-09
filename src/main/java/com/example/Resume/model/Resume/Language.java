package com.example.Resume.model.Resume;

import com.example.Resume.model.User;

import javax.persistence.*;

@Entity
@Table(name = "language")
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String language;
    private String level;
    private String type;

    @OneToOne(mappedBy = "language",cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private User user;

    public Language(){}

    public Language(String name, String level, String type) {

        this.language = name;
        this.level = level;
        this.type = type;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return language;
    }

    public void setName(String name) {
        this.language = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
