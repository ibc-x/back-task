package com.fst.taskManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fst.taskManager.model.CustomUser;




public interface UserRepository extends JpaRepository<CustomUser, Long>{
    public CustomUser findByLogin(String username);
}
