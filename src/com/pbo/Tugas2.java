package com.pbo;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        double Gallons;
        double count;

        System.out.println("====Konversi Satuan Liter Galon====");
        System.out.println("\nMasukkan Jumlah : ");

        Gallons = scan.nextDouble();
        count = Gallons *3.785;

        System.out.printf("%.0f Galon = %.3f Liter \n\n", Gallons, count);
    }
}