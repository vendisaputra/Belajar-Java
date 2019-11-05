package com.belajar.Belajar.java.entity;

import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_khs")
public class Khs  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_mahasiswa")
    private Mahasiswa mahasiswa;
    @Column(name = "khs_angka")
    private int khs_angka;
    @Column(name = "khs_huruf")
    private String khs_huruf;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public int getKhs_angka() {
        return khs_angka;
    }

    public void setKhs_angka(int khs_angka) {
        this.khs_angka = khs_angka;
    }

    public String getKhs_huruf() {
        return khs_huruf;
    }

    public void setKhs_huruf(String khs_huruf) {
        this.khs_huruf = khs_huruf;
    }
}
