package Praktikum3.Kegiatan12.Child;

import Praktikum3.Kegiatan12.Parent.Struktur;

public class kebersihan extends Struktur {

    public void kebersihan (String nama, int umur, String jeniskelamin, String posisi) {
        super.kebersihan(nama, umur, jeniskelamin, posisi);
        System.out.println("Nama : " +nama);
        System.out.println("Umur : " +umur);
        System.out.println("Jenis Kelamin : " +jeniskelamin);
        System.out.println("Posisi : " +posisi);
    }
}
