package com.Praktikum4.Kegiatan2;

public class PersegiPanjang extends SegiEmpat {

    public int panjang;
    public int lebar;


    public PersegiPanjang( int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public PersegiPanjang() {

    }

    @Override
    double luas() {
        double luas;
        luas = panjang*lebar;
        return luas;
    }

    @Override
    double keliling() {
        double keliling;
        keliling = 2*(panjang+lebar);
        return keliling;
    }
}
