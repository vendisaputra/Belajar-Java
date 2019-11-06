package com.belajar.Belajar.java.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
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

    public void setKhs(Set<Khs> khs) {
        this.khs = khs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }
}
