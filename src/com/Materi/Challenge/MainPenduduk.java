package com.Materi.Challenge;

import java.util.Scanner;

public class MainPenduduk {

    static Registrasi p = new Registrasi();

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        inputnama();
        inputnik();
        inputusia();
        inputjenkel();
        inputusername();
        inputemail();
        inputpassword();
        datainputan();

    }

    public static void inputnik(){

        String nik;
        int menu;
        System.out.println("\n1. Random NIK" );
        System.out.println("2. Input Manual");
        System.out.print("\nPilih menu : ");
        menu = input.nextInt();


        switch(menu){

            case 1:

                p.setNIK();

                break;

            case 2:

                System.out.print("\nMasukkan NIK : ");

                nik = input.next();

                p.setNIK(nik);

                if(!nik.matches("[0-9]*")){

                    System.out.println("\nERROR: NIK Tidak Boleh ada Huruf/Symbol");

                    inputnik();

                } else if (nik.length() < 10){

                    System.out.print("\nERROR: NIK kurang dari 10 digit");

                    inputnik();
                }
                else if(nik.length() > 10){

                    System.out.print("\nERROR: NIK lebih dari 10 digit");

                    inputnik();
                }

                break;

            default:

                System.out.print("\nERROR: Menu Tidak Ada!");

                inputnik();
        }

    }


    public static void inputnama(){

        String nama;

        System.out.print("\nMasukkan Nama : ");

        nama = input.nextLine();

        p.setNama(nama);

    }

    public static void inputusia(){

        int usia;

        System.out.print("\nMasukkan Usia : ");

        usia = input.nextInt();

        p.setUsia(usia);

    }

    public static void inputjenkel(){

        char jenkel;

        System.out.print("\nMasukkan Jenis Kelamin (L/P) : ");

        jenkel = input.next().charAt(0);

        if(jenkel == 'L' || jenkel == 'P'){

            p.setJeniskelamin(jenkel);

        } else {

            System.out.print("\nERROR: Anda Hanya Boleh Input antarA L/P!");

            inputjenkel();
        }

    }

    public static void inputusername(){

        String username;

        int pilih;

        System.out.println("\n1. Username Otomatis" );

        System.out.println("2. Input Manual");

        System.out.print("\nPilih Menu : ");

        pilih = input.nextInt();

        switch(pilih){

            case 1:

                p.setUsername();

                break;

            case 2:
                System.out.print("\nMasukkan Username : ");

                username = input.next();

                p.setUsername(username);

                break;

            default:

                System.out.print("\nERROR: Menu Tidak Ada!");

                inputusername();
        }

    }

    public static void inputemail(){

        String email;

        System.out.print("\nMasukkan Email : ");

        email = input.next();

        if(email.matches("(.)@gmail.com") || email.matches("(.)@webmail.umm.ac.id")){

            p.setEmail(email);

        } else {

            System.out.print("\nERROR: Inputan Wajib Ada @gmail.com atau @webmail.umm.ac.id!");

            inputemail();

        }

    }


    public static void inputpassword(){

        String password;

        System.out.print("\nMasukkan password : ");

        password = input.next();

        if(password.length() >= 8){

            p.setPassword(password);

        } else {

            System.out.print("\nERROR: Password Yang Anda Input Kurang dari 8 Karakter!");

            inputpassword();
        }

    }

    public static void datainputan(){

        System.out.println("\n---- Data Inputan ----");

        System.out.println("Nama            : " + p.getNama());
        System.out.println("Usia            : " + p.getUsia());
        System.out.println("Jenis Kelamin   : " + p.getJeniskelamin());
        System.out.println("NIK             : " + p.getNIK());
        System.out.println("Email           : " + p.getEmail());
        System.out.println("Username        : " + p.getUsername());
        System.out.println("Password        : " + p.getPassword());
    }


}
