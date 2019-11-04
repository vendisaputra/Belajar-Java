package com.belajar.Belajar.java.controller;

import com.belajar.Belajar.java.entity.Mahasiswa;
import com.belajar.Belajar.java.service.MahasiswaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/mahasiswa")
@Slf4j

public class MahasiswaController {
    private final MahasiswaService mahasiswaService;

    public MahasiswaController(MahasiswaService mahasiswaService) {
        this.mahasiswaService = mahasiswaService;
    }

    @GetMapping
    public ResponseEntity<List<Mahasiswa>> findAll(){
        return ResponseEntity.ok(mahasiswaService.findAll());
    }

    @PostMapping
    public ResponseEntity create(@Valid @RequestBody Mahasiswa mahasiswa){
        return ResponseEntity.ok(mahasiswaService.save(mahasiswa));
    }


}
