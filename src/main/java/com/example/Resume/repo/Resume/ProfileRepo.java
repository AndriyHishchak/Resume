package com.example.Resume.repo.Resume;

import com.example.Resume.model.Resume.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepo extends JpaRepository<Profile,Long> {
}
