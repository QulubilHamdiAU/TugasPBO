package com.Materi;

import java.util.Scanner;

public class StudyTool {
    public static void main(String[] args){

        Scanner scanterm = new Scanner(System.in);
        String termvar;
        System.out.println("Program studi anda saat ini");
        termvar = scanterm.nextLine();
        String termdef;
        System.out.println("Mata Kuliah anda saat ini");
        termdef = scanterm.nextLine();

        System.out.println("Prodi anda"+termvar+"mata kuliah anda saat ini"+termdef);
    }
}
