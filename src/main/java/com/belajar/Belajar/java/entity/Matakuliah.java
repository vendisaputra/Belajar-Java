package com.belajar.Belajar.java.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "tb_matakuliah")
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
    @OneToMany(mappedBy = "matakuliah")
    private Set<Khs> khs;


}
