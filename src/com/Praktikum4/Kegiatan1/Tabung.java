package com.Praktikum4.Kegiatan1;

import java.util.Scanner;

public class Tabung extends BangunRuang{

    @Override
    void getLuasPermukaan() {
        float r,t,h;
        Scanner scan = new Scanner(System.in);
        System.out.println("=== MENGHITUNG LUAS PERMUKAAN TABUNG ===\n");
        System.out.print("Jari-jari  : ");
        r = scan.nextFloat();
        System.out.print("Tinggi  : ");
        t = scan.nextFloat();
        h = 2* 3.14f * r * (r * t);
        System.out.println("Luas Permukaan Tabung Adalah  : " +h);
        System.out.println("\n");
    }

    @Override
    void getVolume() {
        float r,t,v;
        Scanner scan = new Scanner(System.in);
        System.out.println("=== MENGHITUNG VOLUME TABUNG ===\n");
        System.out.print("Jari-jari  : ");
        r = scan.nextFloat();
        System.out.print("Tinggi  : ");
        t = scan.nextFloat();
        v = 3.14f * (r * r) * t;
        System.out.println("Volume Tabung Adalah  : " +v);
    }
}
