package com.training.myrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.training.myrestapi.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    public UserEntity findByUsername(String username);
}
