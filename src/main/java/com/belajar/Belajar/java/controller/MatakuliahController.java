package com.belajar.Belajar.java.controller;

import com.belajar.Belajar.java.entity.Matakuliah;
import com.belajar.Belajar.java.service.MatakuliahService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@Slf4j
@RequestMapping("/api/matakuliah")
public class MatakuliahController {

    private final MatakuliahService matakuliahService;

    public MatakuliahController(MatakuliahService matakuliahService) {
        this.matakuliahService = matakuliahService;
    }

    @GetMapping
    public ResponseEntity<List<Matakuliah>> findAll(){
        return ResponseEntity.ok(matakuliahService.findAll());
    }

    @PostMapping
    public ResponseEntity create(@Valid @RequestBody Matakuliah matakuliah){
        return ResponseEntity.ok(matakuliahService.save(matakuliah));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Matakuliah> findById(@PathVariable int id){
        Optional<Matakuliah> matakuliah = matakuliahService.findById(id);
        if (!matakuliahService.findById(id).isPresent()) {
            ResponseEntity.badRequest().build();
        }
           return ResponseEntity.ok(matakuliah.get());
    }

    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable int id, @Valid @RequestBody Matakuliah matakuliah){
        if(!matakuliahService.findById(id).isPresent()){
            return ResponseEntity.badRequest().build();
        }else{
            return ResponseEntity.ok(matakuliahService.save(matakuliah));
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable int id){
        if(!matakuliahService.findById(id).isPresent()){
            return ResponseEntity.badRequest().build();
        }else{
            matakuliahService.deleteById(id);
            return ResponseEntity.ok().build();
        }
    }


}
