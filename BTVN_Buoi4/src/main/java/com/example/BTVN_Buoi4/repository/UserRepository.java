package com.example.BTVN_Buoi4.repository;

import com.example.BTVN_Buoi4.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User, Integer> {}
