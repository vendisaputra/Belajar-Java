package com.belajar.Belajar.java.service;

import com.belajar.Belajar.java.entity.Semester;
import com.belajar.Belajar.java.repository.SemesterRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SemesterService  {
    private final SemesterRepository semesterRepository;

    public SemesterService(SemesterRepository semesterRepository) {
        this.semesterRepository = semesterRepository;
    }

    public List<Semester> findAll(){
        return semesterRepository.findAll();
    }

    public Optional<Semester> findById(int id){
        return semesterRepository.findById(id);
    }

    public Semester save(Semester semester){
        return semesterRepository.save(semester);
    }

    public void deleteById(int id){
        semesterRepository.deleteById(id);
    }
}
