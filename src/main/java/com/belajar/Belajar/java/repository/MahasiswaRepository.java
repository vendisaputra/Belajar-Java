package com.belajar.Belajar.java.repository;

import com.belajar.Belajar.java.entity.Mahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MahasiswaRepository extends JpaRepository<Mahasiswa, Integer> {
}
