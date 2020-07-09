package com.example.Resume.model.Resume;

import com.example.Resume.model.User;

import javax.persistence.*;

@Entity
@Table(name = "education")
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String summary;
    private int begin_year;
    private int finish_year;
    private String university;
    private String faculty;
    @OneToOne(mappedBy = "education",cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private User user;
    public Education(){}

    public Education( String summary, int begin_year, int finish_year, String university, String faculty) {
        this.summary = summary;
        this.begin_year = begin_year;
        this.finish_year = finish_year;
        this.university = university;
        this.faculty = faculty;
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

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getBegin_year() {
        return begin_year;
    }

    public void setBegin_year(int begin_year) {
        this.begin_year = begin_year;
    }

    public int getFinish_year() {
        return finish_year;
    }

    public void setFinish_year(int finish_year) {
        this.finish_year = finish_year;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
