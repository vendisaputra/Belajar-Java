package com.belajar.Belajar.java.controller;

import com.belajar.Belajar.java.entity.Semester;
import com.belajar.Belajar.java.service.SemesterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@Slf4j
@RequestMapping("/api/semester")
public class SemesterController {

    private final SemesterService semesterService;

    public SemesterController(SemesterService semesterService) {
        this.semesterService = semesterService;
    }

    @GetMapping
    public ResponseEntity<List<Semester>> findAll(){
        return ResponseEntity.ok(semesterService.findAll());
    }

    @PostMapping
    public ResponseEntity create(Semester semester){
        return ResponseEntity.ok(semesterService.save(semester));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Semester> findById(@PathVariable int id){
        Optional<Semester> semester = semesterService.findById(id);
        if(!semester.isPresent()){
            ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(semester.get());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Semester> update(@PathVariable int id, @Valid @RequestBody Semester semester){
        if(!semesterService.findById(id).isPresent()){
            ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(semesterService.save(semester));
    }

    @DeleteMapping({"/{id}"})
    public void delete(@PathVariable int id){
        if(!semesterService.findById(id).isPresent()){
            ResponseEntity.badRequest().build();
        }else{
            ResponseEntity.ok().build();
        }
    }
}
