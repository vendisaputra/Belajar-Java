package com.belajar.Belajar.java.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_dosen")
@Getter
@Setter
public class Dosen implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "nip")
    private String nip;
    @Column(name = "dsn_nama")
    private String nama;
    @Column(name = "dsn_gender")
    private String gender;
    @Column(name = "dsn_status")
    private String status;
}
