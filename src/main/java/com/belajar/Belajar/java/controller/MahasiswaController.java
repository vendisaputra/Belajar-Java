package com.belajar.Belajar.java.controller;

import com.belajar.Belajar.java.entity.Mahasiswa;
import com.belajar.Belajar.java.service.MahasiswaService;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

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

    @GetMapping("/{id}")
    public ResponseEntity<Mahasiswa> findById(@PathVariable int id){
        Optional<Mahasiswa> mahasiswa = mahasiswaService.findById(id);
        if(!mahasiswa.isPresent()){
            System.out.println("Id " + id + " gak enek!");
            ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(mahasiswa.get());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Mahasiswa> update(@PathVariable int id, @Valid @RequestBody Mahasiswa mahasiswa){
        if(!mahasiswaService.findById(id).isPresent()){
            ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(mahasiswaService.save(mahasiswa));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable int id){
        if(!mahasiswaService.findById(id).isPresent()){
            ResponseEntity.badRequest().build();
        }else{
            mahasiswaService.deleteById(id);
        }
        return ResponseEntity.ok().build();

    }


}
