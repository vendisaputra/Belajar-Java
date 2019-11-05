package com.belajar.Belajar.java.entity;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Entity @Table(name = "tb_mahasiswa")
@EqualsAndHashCode(exclude = "khs")
public class Mahasiswa {

    @Id @GeneratedValue
    private int id;

    @Column(name = "nim")
    private String nim;
    @Column(name="mhs_nama")
    private String nama;
    @Column(name = "mhs_gender")
    private String gender;
    @Column(name = "mhs_alamat")
    private String alamat;
    @Column(name = "mhs_tgllahir")
    private Date tglLahir;
    @OneToMany(mappedBy = "mahasiswa")
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

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Date getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(Date tglLahir) {
        this.tglLahir = tglLahir;
    }
}
