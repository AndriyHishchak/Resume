package com.example.Resume.model.Resume;

import com.example.Resume.model.User;

import javax.persistence.*;

@Entity
@Table(name = "profileRestore")
public class ProfileRestore {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   private String token;
   @OneToOne(mappedBy = "profileRestore",cascade = CascadeType.ALL)
   @PrimaryKeyJoinColumn
   private User user;
   public ProfileRestore(){};

   public ProfileRestore(String token) {
      this.token = token;
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

   public String getToken() {
      return token;
   }

   public void setToken(String token) {
      this.token = token;
   }
}
