package com.Praktikum4.Kegiatan1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pilih;
        System.out.println("\n\t\t\tPRAKTIKUM MODUL 4\n");
        System.out.println("MENGHITUNG LUAS PERMUKAAN DAN VOLUME BANGUN RUANG\n");
        System.out.println("1. Tabung");
        System.out.println("2. Balok\n");
        System.out.print("Pilih : ");
        pilih = scan.nextInt();

        if (pilih == 1) {
            Tabung hitung1 = new Tabung();
            hitung1.getLuasPermukaan();
            hitung1.getVolume();
        }
        else if (pilih == 2) {
            Balok hitung2 = new Balok();
            hitung2.getLuasPermukaan();
            hitung2.getVolume();
        }
    }
}
