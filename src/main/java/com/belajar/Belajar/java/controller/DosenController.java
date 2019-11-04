package com.belajar.Belajar.java.controller;

import com.belajar.Belajar.java.entity.Dosen;
import com.belajar.Belajar.java.entity.Mahasiswa;
import com.belajar.Belajar.java.service.DosenService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/dosen")
@Slf4j
public class DosenController {
    private final DosenService dosenService;

    public DosenController(DosenService dosenService) {
        this.dosenService = dosenService;
    }

    @GetMapping
    public ResponseEntity<List<Dosen>> findAll(){
        return ResponseEntity.ok(dosenService.findAll());
    }

    @PostMapping
    public ResponseEntity create(@Valid @RequestBody Dosen dosen){
        return ResponseEntity.ok(dosenService.save(dosen));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Dosen> findById(@PathVariable int id){
        Optional<Dosen> dosen = dosenService.findById(id);
        if(!dosenService.findById(id).isPresent()){
           return ResponseEntity.badRequest().build();
        }else{
            return ResponseEntity.ok(dosen.get());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Dosen> update(@PathVariable int id, @Valid @RequestBody Dosen dosen){
        if (!dosenService.findById(id).isPresent()){
            return ResponseEntity.badRequest().build();
        }else{
            return ResponseEntity.ok(dosenService.save(dosen));
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable int id){
        if (!dosenService.findById(id).isPresent()){
            return ResponseEntity.badRequest().build();
        }else{
            dosenService.deleteById(id);
            return ResponseEntity.ok().build();
        }
    }

}
