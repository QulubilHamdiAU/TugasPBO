package com.Praktikum4.Kegiatan2;

public class Balok extends PersegiPanjang{
    public double tinggi;

    public Balok(double tinggi) {
        super();
        this.tinggi = tinggi;
    }


    public void getVolume(){
        double getVolume  = panjang * lebar * tinggi;
        System.out.println("volume balok adalah :  "+getVolume);
    }
}
