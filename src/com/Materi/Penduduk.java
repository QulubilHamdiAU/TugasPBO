package com.Materi;

public class Penduduk {
    private String Nik;
    private int Usia;
    private char Jeniskelamin;
    private String Nama;

    public Penduduk(){

    }
    public Penduduk(String Nik, int Usia, char Jeniskelamin, String Nama){
        this.Jeniskelamin = Jeniskelamin;
        this.Nik = Nik;
        this.Usia = Usia;
        this.Nama = Nama;
    }
    public void setNik (String Nik) {
        this.Nik = Nik;
    }
    public void setUsia (int Usia) {
        this.Usia = Usia;
    }
    public void setJeniskelamin (char Jeniskelamin) {
        this.Jeniskelamin = Jeniskelamin;
    }
    public void setNama (String Nama) {
        this.Nama = Nama;
    }

    public String getNik() {
        return this.Nik;
    }
    public int getUsia() {
        return this.Usia;
    }
    public char getJeniskelamin() {
        return this.Jeniskelamin;
    }
    public String getNama() {
        return this.Nama;
    }
}
