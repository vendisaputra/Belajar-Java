package com.belajar.Belajar.java.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Set;

@Entity
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

    public void setKhs(Set<Khs> khs) {
        this.khs = khs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getKet() {
        return ket;
    }

    public void setKet(String ket) {
        this.ket = ket;
    }
}
