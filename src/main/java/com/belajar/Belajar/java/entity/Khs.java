package com.belajar.Belajar.java.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name = "tb_khs")
public class Khs  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_mahasiswa")
    private Mahasiswa mahasiswa;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_semester")
    private Semester semester;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_matkul")
    private Matakuliah matakuliah;
    @Column(name = "khs_angka")
    private int khs_angka;
    @Column(name = "khs_huruf")
    private String khs_huruf;

}
