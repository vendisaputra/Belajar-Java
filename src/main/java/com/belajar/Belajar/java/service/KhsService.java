package com.belajar.Belajar.java.service;

import com.belajar.Belajar.java.entity.Khs;
import com.belajar.Belajar.java.repository.KhsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KhsService {
    @Autowired
    private final KhsRepository khsRepository;

    public KhsService(KhsRepository khsRepository) {
        this.khsRepository = khsRepository;
    }

    public List<Khs> findAll(){
        return khsRepository.findAll();
    }

    public Optional<Khs> findById(int id){
        return khsRepository.findById(id);
    }

    public Khs save(Khs khs){
        return khsRepository.save(khs);
    }

    public void deleteById(int id){
        khsRepository.deleteById(id);
    }


}
