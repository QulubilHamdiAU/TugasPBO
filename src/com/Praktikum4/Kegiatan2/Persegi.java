package com.Praktikum4.Kegiatan2;

public class Persegi extends SegiEmpat {

    public int sisi;


    public Persegi( int sisi) {
        this.sisi =sisi;
    }

    public Persegi() {

    }

    @Override
    double luas() {
        double luas;
        luas = sisi * sisi;
        return luas;
    }

    @Override
    double keliling() {
        double keliling;
        keliling = 4 * sisi;
        return keliling;
    }
}
