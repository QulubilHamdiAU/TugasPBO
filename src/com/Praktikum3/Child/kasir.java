package com.Praktikum3.Child;

import com.Praktikum3.Parent.Struktur;

public class kasir extends Struktur {

    public void kasir(String nama, int umur, String jeniskelamin, String posisi) {
        super.kasir(nama, umur, jeniskelamin, posisi);
        System.out.println("Nama : " +nama);
        System.out.println("Umur : " +umur);
        System.out.println("Jenis Kelamin : " +jeniskelamin);
        System.out.println("Posisi : " +posisi);
    }
}
