package com.nissan.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nissan.model.UserRegistration;

@Repository
public interface UserDao extends JpaRepository<UserRegistration, Integer>{

}
