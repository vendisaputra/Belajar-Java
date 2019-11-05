package com.belajar.Belajar.java.controller;

import com.belajar.Belajar.java.entity.Khs;
import com.belajar.Belajar.java.entity.KhsJoin;
import com.belajar.Belajar.java.service.KhsService;
import com.belajar.Belajar.java.service.MahasiswaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

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


}
