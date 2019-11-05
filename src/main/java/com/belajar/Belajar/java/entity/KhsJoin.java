package com.belajar.Belajar.java.entity;

import java.io.Serializable;

public class KhsJoin implements Serializable {
    private String nim;
    private String nama;
    private String mtk_nama;
    private int semester;
    private int angka;
    private String huruf;

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

    public String getMtk_nama() {
        return mtk_nama;
    }

    public void setMtk_nama(String mtk_nama) {
        this.mtk_nama = mtk_nama;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getAngka() {
        return angka;
    }

    public void setAngka(int angka) {
        this.angka = angka;
    }

    public String getHuruf() {
        return huruf;
    }

    public void setHuruf(String huruf) {
        this.huruf = huruf;
    }

    public KhsJoin(String nim, String nama, String mtk_nama, int semester, int angka, String huruf){
        this.nim = nim;
        this.nama = nama;
        this.mtk_nama = mtk_nama;
        this.semester = semester;
        this.angka = angka;
        this.huruf = huruf;
    }
}
