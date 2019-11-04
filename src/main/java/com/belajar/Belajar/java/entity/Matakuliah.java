package com.belajar.Belajar.java.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data @Table(name = "tb_matakuliah")
public class Matakuliah {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "mtk_nama")
    private String nama;
    @Column(name = "mtk_kode")
    private String kode;
    @Column(name = "mtk_sks")
    private int sks;
}
