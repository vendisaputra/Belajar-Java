package com.belajar.Belajar.java.service;

import com.belajar.Belajar.java.entity.Dosen;
import com.belajar.Belajar.java.entity.Mahasiswa;
import com.belajar.Belajar.java.repository.DosenRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DosenService {
    private final DosenRepository dosenRepository;

    public DosenService(DosenRepository dosenRepository) {
        this.dosenRepository = dosenRepository;
    }

    public List<Dosen> findAll(){
        return dosenRepository.findAll();
    }

    public Optional<Dosen> findById(int id) {
        return dosenRepository.findById(id);
    }

    public Dosen save(Dosen dosen) {
        return dosenRepository.save(dosen);
    }

    public void deleteById(int id) {
        dosenRepository.deleteById(id);
    }
}
