package com.Praktikum2;

import java.util.Scanner;

public class P2Keliling {
    static  Scanner input = new Scanner(System.in);
    double phi = 3.14;
    double kelling;
    public void Keliling() {
        System.out.println("=== Menu Keliling Lingkaran ===\n");
        System.out.print("masukkan nilai jari-jari = ");
        double r = input.nextDouble();
        kelling = 2 * phi * r;
        System.out.println("Keliling Lingkarannya adalah = " +kelling);
    }
}
