package com.example.Resume.model.Resume;

import com.example.Resume.model.User;

import javax.persistence.*;

@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String school;
    private String finish_date;
    @OneToOne(mappedBy = "course",cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private User user;
    public Course(){}

    public Course( String name, String school, String finish_date) {

        this.school = school;
        this.finish_date = finish_date;
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

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getFinish_date() {
        return finish_date;
    }

    public void setFinish_date(String finish_date) {
        this.finish_date = finish_date;
    }
}
