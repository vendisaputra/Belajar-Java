package com.belajar.Belajar.java.service;

import com.belajar.Belajar.java.entity.Mahasiswa;
import com.belajar.Belajar.java.repository.MahasiswaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service


public class MahasiswaService {
    private final MahasiswaRepository mahasiswaRepository;

    public MahasiswaService(MahasiswaRepository mahasiswaRepository) {
        this.mahasiswaRepository = mahasiswaRepository;
    }

    public List<Mahasiswa> findAll(){
        return mahasiswaRepository.findAll();
    }

    public Optional<Mahasiswa> findById(int id) {
        return mahasiswaRepository.findById(id);
    }

    public Mahasiswa save(Mahasiswa mahasiswa) {
        return mahasiswaRepository.save(mahasiswa);
    }

    public void deleteById(int id) {
       mahasiswaRepository.deleteById(id);
    }
}
