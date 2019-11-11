package com.belajar.Belajar.java.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "tb_semester")
@EqualsAndHashCode(exclude = "khs")
public class Semester {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "semester")
    private int semester;
    @Column(name = "ket")
    private String ket;
    @OneToMany(mappedBy = "semester")
    private Set<Khs> khs;


}
