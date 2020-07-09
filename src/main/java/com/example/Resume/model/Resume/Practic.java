package com.example.Resume.model.Resume;

import com.example.Resume.model.User;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "practic")
public class Practic {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;

    private String position;
    private String company;
    private Date begin_date;
    private Date finish_date;
    private String responsibilities;
    private String demo;
    private String src;

    @OneToOne(mappedBy = "practic",cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private User user;
    public Practic(){};

    public Practic(
                   String position,
                   String company,
                   Date begin_date,
                   Date finish_date,
                   String responsibilities,
                   String demo,
                   String src) {

        this.position = position;
        this.company = company;
        this.begin_date = begin_date;
        this.finish_date = finish_date;
        this.responsibilities = responsibilities;
        this.demo = demo;
        this.src = src;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Date getBegin_date() {
        return begin_date;
    }

    public void setBegin_date(Date begin_date) {
        this.begin_date = begin_date;
    }

    public Date getFinish_date() {
        return finish_date;
    }

    public void setFinish_date(Date finish_date) {
        this.finish_date = finish_date;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    public void setResponsibilities(String responsibilities) {
        this.responsibilities = responsibilities;
    }

    public String getDemo() {
        return demo;
    }

    public void setDemo(String demo) {
        this.demo = demo;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }
}
