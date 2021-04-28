package com.Praktikum4.Kegiatan2;

public class Kubus extends Persegi{
    public double tinggi;


    public Kubus(double tinggi) {
        super();
        this.tinggi = tinggi;
    }


    public void getVolume(){
        double getVolume = sisi * sisi *sisi;
        System.out.println("hasil volume kubus "+getVolume);
    }

}
