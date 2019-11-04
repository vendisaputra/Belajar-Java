package com.belajar.Belajar.java.entity;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity @Table(name = "tb_mahasiswa")
@Data
public class Mahasiswa implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
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

}
