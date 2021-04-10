package com.Praktikum2;

import java.util.Scanner;

public class P2Luas {
    static  Scanner input = new Scanner(System.in);
    double phi = 3.14;
    double luasLing;
    public void Luas() {
        System.out.println("=== Menu Luas Lingkaran ===\n");
        System.out.print("masukkan nilai jari-jari = ");
        double r = input.nextDouble();
        luasLing = phi * r * r;
        System.out.println("Keliling Lingkarannya adalah = " +luasLing);
    }
}
