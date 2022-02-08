package com.redhat.demo.dao;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.redhat.demo.entity.User;


@Repository
public interface UserDao extends JpaRepository<User, Integer> {
}
