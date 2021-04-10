package com.Praktikum2;

import java.util.Scanner;

public class P2Main {

    static  Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        P2Keliling keliling = new P2Keliling();
        P2Luas luas = new P2Luas();
        int pilih;

        System.out.println("===== MENU LUAS / KELILING LINGKARAN=====\n");
        System.out.println("1. Keliling Lingkaran");
        System.out.println("2. Luas Lingkaran\n");
        System.out.print("Pilih Menu : ");
        pilih = input.nextInt();

        if (pilih == 1) {
            keliling.Keliling();
        }
        else if (pilih == 2) {
            luas.Luas();
        }

    }
}
