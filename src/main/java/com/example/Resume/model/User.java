package com.example.Resume.model;

import com.example.Resume.model.Resume.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    private int active;

    private String roles;

    private String permissions;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="profile_id")
    private Profile profile;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="certificate_id")
    private Certificate certificate;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id")
    private Course course;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "education_id")
    private Education education;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "hobby_id")
    private Hobby hobby;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "language_id")
    private Language language;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "persistentLogins_id")
    private PersistentLogins persistentLogins;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "practic_id")
    private Practic practic;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profileRestore_id")
    private ProfileRestore profileRestore;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "skillUser_id")
    private Skill skill;

    public User(Long id,String username,String password,String roles,String permissions) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.roles = roles;
        this.permissions = permissions;
        this.active = 1;
    }

    public User() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public List<String> getRoleList() {
        if (this.roles.length() > 0) {
        return Arrays.asList(this.roles.split(","));
        }
        return new ArrayList<>();
        }


    public void setRoles(String roles) {
        this.roles = roles;
    }

    public List<String> getPermissionList() {
        if (this.permissions.length() > 0) {
            return Arrays.asList(this.permissions.split(","));
        }
        return new ArrayList<>();
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String getRoles() {
        return roles;
    }

    public String getPermissions() {
        return permissions;
    }

    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public Hobby getHobby() {
        return hobby;
    }

    public void setHobby(Hobby hobby) {
        this.hobby = hobby;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public PersistentLogins getPersistentLogins() {
        return persistentLogins;
    }

    public void setPersistentLogins(PersistentLogins persistentLogins) {
        this.persistentLogins = persistentLogins;
    }

    public Practic getPractic() {
        return practic;
    }

    public void setPractic(Practic practic) {
        this.practic = practic;
    }

    public ProfileRestore getProfileRestore() {
        return profileRestore;
    }

    public void setProfileRestore(ProfileRestore profileRestore) {
        this.profileRestore = profileRestore;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
