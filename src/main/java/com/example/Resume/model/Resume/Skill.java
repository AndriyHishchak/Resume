package com.example.Resume.model.Resume;

import com.example.Resume.model.User;

import javax.persistence.*;

@Entity
@Table(name = "skill")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long  id;

    private int category;
    private String value;

    @OneToOne(mappedBy = "skill",cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private SkillCategory skillCategory;

    @OneToOne(mappedBy = "skill",cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private User user;
    public Skill(){}

    public Skill(int id_profile, int category, String value) {
        this.category = category;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public SkillCategory getSkillCategory() {
        return skillCategory;
    }

    public void setSkillCategory(SkillCategory skillCategory) {
        this.skillCategory = skillCategory;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
