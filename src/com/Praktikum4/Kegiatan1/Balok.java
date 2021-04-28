package com.Praktikum4.Kegiatan1;

import java.util.Scanner;

public class Balok extends BangunRuang{

    @Override
    void getLuasPermukaan() {
        int p,l,t,h;
        Scanner scan = new Scanner(System.in);
        System.out.println("=== MENGHITUNG LUAS PERMUKAAN BALOK ===\n");
        System.out.print("Panjang  : ");
        p = scan.nextInt();
        System.out.print("Lebar  : ");
        l = scan.nextInt();
        System.out.print("Tinggi  : ");
        t = scan.nextInt();
        h = 2*(p*l+p*t+l*t);
        System.out.println("Luas Permukaan Balok Adalah  : " +h);
        System.out.println("\n");
    }

    @Override
    void getVolume() {
        int p,l,t,v;
        Scanner scan = new Scanner(System.in);
        System.out.println("=== MENGHITUNG VOLUME BALOK ===\n");
        System.out.print("Panjang  : ");
        p = scan.nextInt();
        System.out.print("Lebar  : ");
        l = scan.nextInt();
        System.out.print("Tinggi  : ");
        t = scan.nextInt();
        v = p * l * t;
        System.out.println("Volume Balok Adalah  : " +v);
    }
}
