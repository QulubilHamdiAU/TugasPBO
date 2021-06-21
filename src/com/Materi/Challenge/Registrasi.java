package com.Materi.Challenge;

import java.util.ArrayList;
import java.util.Collections;

public class Registrasi {

    private String NIK;
    private String nama;
    private String username;
    private String email;
    private char jeniskelamin;
    private int usia;
    private String Password;

    public String getNIK() {

        return NIK;

    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public void setNIK() {
        ArrayList<String> a = new ArrayList<>();

        a.add("1");
        a.add("2");
        a.add("3");
        a.add("4");
        a.add("5");
        a.add("6");
        a.add("7");
        a.add("8");
        a.add("9");
        a.add("0");

        Collections.shuffle(a);

        StringBuilder NIK = new StringBuilder();

        for(String b:a) {
            NIK.append(b);
        }
        this.NIK = NIK.toString();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsername() {

        return username;
    }

    public void setUsername() { // username random

        String[] name = nama.split("\\s");
        this.username = name[name.length -1];

    }

    public void setUsername(String username) { // username manual
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;

    }

    public char getJeniskelamin() {
        return jeniskelamin;
    }

    public void setJeniskelamin(char jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

}
