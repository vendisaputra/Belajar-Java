package com.belajar.Belajar.java.controller;

import com.belajar.Belajar.java.entity.Khs;
import com.belajar.Belajar.java.entity.KhsJoin;
import com.belajar.Belajar.java.service.KhsService;
import com.belajar.Belajar.java.service.MahasiswaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@Slf4j
@RequestMapping("/api/khs")
public class KhsController {
    private final KhsService khsService;

    private final MahasiswaService mahasiswaService;

    private EntityManagerFactory entityManagerFactory;

    public KhsController(KhsService khsService, MahasiswaService mahasiswaService) {
        this.khsService = khsService;
        this.mahasiswaService = mahasiswaService;
    }

    @GetMapping
    public ResponseEntity<List<Khs>> getAll(){
        return ResponseEntity.ok(khsService.findAll());
    }

    @PostMapping
    public ResponseEntity create(@Valid @RequestBody Khs khs){
        return ResponseEntity.ok(khsService.save(khs));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Khs> findById(@PathVariable int id){
        Optional<Khs> khs = khsService.findById(id);
        if(!khsService.findById(id).isPresent()){
            ResponseEntity.badRequest().build();
        }
            return ResponseEntity.ok(khs.get());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Khs> update(@PathVariable int id, @Valid @RequestBody Khs khs){
        if (!khsService.findById(id).isPresent()){
            ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(khsService.save(khs));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable int id){
        if (!khsService.findById(id).isPresent()){
            ResponseEntity.badRequest().build();
        }
        khsService.deleteById(id);
        return ResponseEntity.ok().build();
    }


}
