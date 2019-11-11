package com.belajar.Belajar.java.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Entity
@Getter
@Setter
@Table(name = "tb_mahasiswa")
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



}
