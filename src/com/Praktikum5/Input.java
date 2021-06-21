package com.Praktikum5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Input {
    Rekap Rkp = new Rekap();

    int[] data_nilai = new int[255];
    String[] data_nama = new String[255];
    String[] data_matkul = new String[255];

    boolean cek;

    int pilih;
    int i = 0;

    public void Menu() {
        Scanner input = new Scanner(System.in);
        String kosong = "";

        System.out.println("=== REKAP NILAI ===");
        System.out.println("1. Input Data\n2. Tunjukkan Data\n3. Keluar\nPilih : ");
        pilih = input.nextInt();

        switch (pilih) {
            case 1 :
                do {
                    cek = false;
                    inputNama(input, kosong);
                    inputMatkul(input, kosong);
                    inputNilai(input);

                    inputFile();
                    input.nextLine();

                    cek = Continue(input, cek);

                    i++;
                } while (cek);
                break;

            case 2 :
                readFile();
                System.out.println();
                Menu();
                break;
            default:
                break;
        }
    }

    private void inputNama(Scanner input, String kosong) {
        String Nama;
        int angka;
        boolean cek;

        do {
            cek = true;
            try {
                angka = 0;
                System.out.print("Masukkan nama : ");
                Nama = input.nextLine();
                char[] ch = Nama.toCharArray();

                for(int n=0; n < Nama.length(); n++){
                    if(ch[n]>=48 && ch[n]<=57){
                        angka++;
                    }
                }

                if (Nama.equals(kosong)) {
                    throw new Exception("Tidak boleh kosong!");
                } else if (Nama.length() <= 3) {
                    throw new Exception("Nama harus lebih dari 3!");
                } else if(angka > 0){
                    throw new Exception("Nama tidak boleh mengandung angka!");
                }

                Rkp.setNama(Nama);
                data_nama[i] = Rkp.getNama();

                cek = false;
            } catch (Exception e) {
                System.err.println(e);
            } finally{
                if(data_nama[i] == null){
                    System.out.println("Kesalahan pada inputan");
                }else{
                    System.out.println("\nNama : "+data_nama[i]);
                }
            }
        } while (cek);
    }

    private void inputMatkul(Scanner input, String kosong) {
        String matkul;

        do {
            cek = true;
            try {
                System.out.print("Masukkan matkul : ");
                matkul = input.nextLine();
                if (matkul.equals(kosong)) {
                    throw new Exception("Tidak boleh kosong!");
                }
                Rkp.setMatkul(matkul);
                data_matkul[i] = Rkp.getMatkul();
                cek = false;
            } catch (Exception e) {
                System.err.println(e);
            } finally{
                if(data_matkul == null){
                    System.out.println("Kesalahan pada inputan");
                }else{
                    System.out.println("\nNama : "+data_nama[i]);
                    System.out.println("Matkul : "+data_matkul[i]);
                }
            }
        } while (cek);
    }

    private void inputNilai(Scanner input) {
        int nilai;
        boolean cek;

        do {
            cek = true;
            try {
                System.out.print("Masukkan nilai : ");
                nilai = input.nextInt();
                if (nilai > 100) {
                    throw new Exception("Nilai maximal 2 digit");
                }

                Rkp.setNilai(nilai);
                data_nilai[i] = Rkp.getNilai();

                cek = false;
            } catch (Exception e) {
                System.err.println(e + " : Harus bilangan bulat!");
                input.nextLine();
            } finally{
                if(data_nilai == null){
                    System.out.println("Kesalahan pada inputan");
                }else{
                    System.out.println("\nNama : "+data_nama[i]);
                    System.out.println("Matkul : "+data_matkul[i]);
                    System.out.println("Niali : "+data_nilai[i]);
                }
            }
        } while (cek);
    }

    private boolean Continue(Scanner input, boolean cek) {
        System.out.println("\nLanjutkan?\n1.Ya\n2.Tidak\nInput : ");
        pilih = input.nextInt();

        switch (pilih) {
            case 1 :
                cek = true;
                break;
            case 2 :
                cek = false;
                Menu();
                break;
            default:
                break;
        }
        return cek;
    }

    private void inputFile() {
        int Nilai;
        String Matkul;
        String Nama;

        try {
            FileWriter file = new FileWriter("file.txt", true);
            BufferedWriter writeData = new BufferedWriter(file);

            Nama = data_nama[i];
            Matkul = data_matkul[i];
            Nilai = data_nilai[i];

            writeData.append(Nama, 0, Nama.length());
            writeData.append(",", 0, 1);
            writeData.append(Matkul, 0, Matkul.length());
            writeData.append(",", 0, 1);
            writeData.append(String.valueOf(Nilai), 0, String.valueOf(Nilai).length());
            writeData.newLine();
            writeData.flush();
            writeData.close();

            file.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void readFile() {
        try {
            FileReader File = new FileReader("file.txt");
            BufferedReader readData = new BufferedReader(File);
            Scanner read = new Scanner(readData);
            read.useDelimiter(" ");
            if (read.hasNext() == false) {
                throw new Exception("Input data terlebih dahulu!");
            }
            System.out.println("Nama\tMatkul\tNilai");
            while (read.hasNext() != false) {
                System.out.print(read.next());
                System.out.print("\t");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

