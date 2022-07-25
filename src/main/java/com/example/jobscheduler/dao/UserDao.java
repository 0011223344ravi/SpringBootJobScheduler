package com.example.jobscheduler.dao;

import com.example.jobscheduler.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
}
