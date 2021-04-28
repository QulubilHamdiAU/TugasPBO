package com.Praktikum4.Kegiatan2;

public class Main {

    public static void main(String[] args) {

        SegiEmpat coba = new PersegiPanjang(14, 15);
        SegiEmpat run = new Persegi(23);
        Kubus kubus = new Kubus(0);
        kubus.sisi = 10;
        Balok balok = new Balok(4);
        balok.panjang = 10;
        balok.lebar = 10;
        kubus.getVolume();
        balok.getVolume();

        System.out.println("luas persegi panjang " + coba.luas());
        System.out.println("keliling persegi panjang adalah " + coba.keliling());
        System.out.println("luas persegi adalah " + run.luas());
        System.out.println("keliling persegi adalah " + run.keliling());

    }
}
