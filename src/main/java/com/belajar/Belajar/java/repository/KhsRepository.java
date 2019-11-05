package com.belajar.Belajar.java.repository;

import com.belajar.Belajar.java.entity.Khs;
import com.belajar.Belajar.java.entity.KhsJoin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface KhsRepository extends JpaRepository<Khs, Integer> {
}
