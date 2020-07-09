package com.example.Resume.model.Resume;

import javax.persistence.*;

@Entity
@Table(name = "skillCategory")
public class SkillCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String category;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "skill_id")
    private Skill skill;
    public SkillCategory(){}

    public SkillCategory(String category) {
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
