package com.example.Resume.model.Resume;


import com.example.Resume.model.User;

import javax.persistence.*;

@Entity
@Table(name = "profile")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;
    private String uid;
    private String first_name;
    private String last_name;
    //Date birth_day;
    private String phone;
    private String email;
    private String country;
    private String city;
    private String objective;
    private String summary;
    private String large_photo;
    private String small_photo;
    private String info;
    private String password;
    private int completed;
    private String created;
    private String skype;
    private String vkontakte;
    private String facebook;
    private String linkedin;
    private String github;
    private String stackoverflow;

    @OneToOne(mappedBy = "profile",cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private User user;
    public Profile(){}

    public Profile(String uid,
                   String first_name,
                   String last_name,
                   //Date birth_day,
                   String phone,
                   String email,
                   String country,
                   String city,
                   String objective,
                   String summary,
                   String large_photo,
                   String small_photo,
                   String info,
                   String password,
                   int completed,
                   String created,
                   String skype,
                   String vkontakte,
                   String facebook,
                   String linkedin,
                   String github,
                   String stackoverflow) {
        this.uid = uid;
        this.first_name = first_name;
        this.last_name = last_name;
        //this.birth_day = birth_day;
        this.phone = phone;
        this.email = email;
        this.country = country;
        this.city = city;
        this.objective = objective;
        this.summary = summary;
        this.large_photo = large_photo;
        this.small_photo = small_photo;
        this.info = info;
        this.password = password;
        this.completed = completed;
        this.created = created;
        this.skype = skype;
        this.vkontakte = vkontakte;
        this.facebook = facebook;
        this.linkedin = linkedin;
        this.github = github;
        this.stackoverflow = stackoverflow;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }



    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    //public Date getBirth_day() {
    // return birth_day;
// }

    //public void setBirth_day(Date birth_day) {
    // this.birth_day = birth_day;
// }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getLarge_photo() {
        return large_photo;
    }

    public void setLarge_photo(String large_photo) {
        this.large_photo = large_photo;
    }

    public String getSmall_photo() {
        return small_photo;
    }

    public void setSmall_photo(String small_photo) {
        this.small_photo = small_photo;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCompleted() {
        return completed;
    }

    public void setCompleted(int completed) {
        this.completed = completed;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getVkontakte() {
        return vkontakte;
    }

    public void setVkontakte(String vkontakte) {
        this.vkontakte = vkontakte;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getStackoverflow() {
        return stackoverflow;
    }

    public void setStackoverflow(String stackoverflow) {
        this.stackoverflow = stackoverflow;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
