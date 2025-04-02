package com.example.BTVN_Buoi4.repository;

import com.example.BTVN_Buoi4.model.Classes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassesRepository extends JpaRepository<Classes, Integer> {}
