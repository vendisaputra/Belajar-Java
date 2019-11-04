package com.belajar.Belajar.java.service;

import com.belajar.Belajar.java.entity.Matakuliah;
import com.belajar.Belajar.java.repository.MatakuliahRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MatakuliahService {
    private final MatakuliahRepository matakuliahRepository;

    public MatakuliahService(MatakuliahRepository matakuliahRepository) {
        this.matakuliahRepository = matakuliahRepository;
    }

    public List<Matakuliah> findAll(){
        return matakuliahRepository.findAll();
    }

    public Optional<Matakuliah> findById(int id){
        return matakuliahRepository.findById(id);
    }

    public Matakuliah save(Matakuliah matakuliah){
        return matakuliahRepository.save(matakuliah);
    }

    public void deleteById(int id){
        matakuliahRepository.deleteById(id);
    }
}
