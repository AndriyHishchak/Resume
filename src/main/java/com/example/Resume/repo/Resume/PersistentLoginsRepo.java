package com.example.Resume.repo.Resume;


import com.example.Resume.model.Resume.PersistentLogins;
import org.springframework.data.repository.CrudRepository;

public interface PersistentLoginsRepo extends CrudRepository<PersistentLogins,Long> {
}
