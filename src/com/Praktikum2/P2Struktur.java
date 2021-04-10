package com.Praktikum2;

import java.util.Scanner;

public class P2Struktur {
    static  Scanner input = new Scanner(System.in);

    private static void Keliling() {
        double phi = 3.14;
        double kelling;
        System.out.println("Menghitung Keliling Lingkaran");
        System.out.print("masukkan nilai jari-jari = ");
        double r = input.nextDouble();
        kelling = 2 * phi * r;
        System.out.println("Keliling Lingkarannya adalah = " +kelling);
    }

    private static void Luas() {
        double phi = 3.14;
        double luasLing;
        System.out.println("Menghitung Luas Lingkaran");
        System.out.print("masukkan nilai jari-jari = ");
        double r = input.nextDouble();
        luasLing = phi * r * r;
        System.out.println("Keliling Lingkarannya adalah = " +luasLing);
    }

    public static void main(String[] args) {
        int pilih, i;
        while (0<2) {
            System.out.println("===== MENU =====");
            System.out.println("1. Keliling Lingkaran");
            System.out.println("2. Luas Lingkaran");
            System.out.println("3. Keluar");
            System.out.println("Pilih : ");
            pilih = input.nextInt();

            for (i = 0; i <1; i++) {
                if (pilih == 1) {
                    Keliling();
                }
                else if (pilih == 2) {
                    Luas();
                }
                else if (pilih == 3) {
                    break;
                }
                else {
                    continue;
                }
            }

            break;
        }
    }
}
