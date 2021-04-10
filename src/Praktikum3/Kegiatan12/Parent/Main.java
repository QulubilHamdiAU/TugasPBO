package Praktikum3.Kegiatan12.Parent;

import Praktikum3.Kegiatan12.Child.supervisor;
import Praktikum3.Kegiatan12.Child.kasir;
import Praktikum3.Kegiatan12.Child.gudang;
import Praktikum3.Kegiatan12.Child.kebersihan;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n\t\t\t\t==PT INDOMARCO PRISMATAMA==");
        System.out.println("\t\t\t====Indomaret Cabang Malang Raya====");
        System.out.println("======Struktur Kepegawaian Indomaret Cabang Malang Raya======\n\n");
        supervisor satu = new supervisor();
        satu.supervisor("Qulubil Hamdi A U", 20, "L", "Supervisor");
        kasir dua = new kasir();
        dua.kasir("Sahistya Pratita", 19, "L", "Kasir");
        gudang tiga = new gudang();
        tiga.gudang("Fajar Dwi Pratama", 19, "L", "Gudang");
        kebersihan empat = new kebersihan();
        empat.kebersihan("Bagus Ivan Setyawan", 19, "L", "Kebersihan");
    }
}
