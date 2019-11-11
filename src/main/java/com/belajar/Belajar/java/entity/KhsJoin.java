package com.belajar.Belajar.java.entity;

import java.io.Serializable;

public class KhsJoin implements Serializable {

    private String nim;

    private String nama;

    private String mtk_nama;

    private int semester;

    private int angka;

    private String huruf;


    public KhsJoin(String nim, String nama, String mtk_nama, int semester, int angka, String huruf){
        this.nim = nim;
        this.nama = nama;
        this.mtk_nama = mtk_nama;
        this.semester = semester;
        this.angka = angka;
        this.huruf = huruf;
    }
}
