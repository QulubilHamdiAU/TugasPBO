package com.Materi.Tugasproyek;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Gudang {

    Scanner run = new Scanner(System.in);
    int input;

    int[] kode = new int[50];
    int[] harga = new int[50];
    int[] stock = new int[50];
    int[] value = new int[50];
    String[] nama = new String[50];

    public Gudang(){
    }

    public void mulai(){
        do{
            System.out.print("masukkan nomor produk : ");
            input = run.nextInt();

            if (input <= 0){
                System.out.println("list produk invalid!");
            }else {
                inputdata();
            }
        }while (input <= 0);
    }
    
    public void inputdata(){
        try{
            for(int i=0;i < input;i++){
                System.out.print("Produk nomor"+(i+1));
                System.out.print("nama produk (tekan 0 jika tidak jadi) : ");

                run.nextLine();
                kode[i]=i+1;
                nama[i] = run.nextLine();

                if (nama[i].equals("0")){
                    break;
                }

                System.out.print("harga produk : ");
                harga[i]= run.nextInt();
                System.out.print("stock produk : ");
                stock[i]= run.nextInt();
                value[i]=stock[i]*harga[i];
            }
        }catch (InputMismatchException e){
            System.out.println("input yang anda masukkan harus angka ");
            run.nextLine();
            mulai();
        }
    }
    
    public void getnilaidata(){
        for (int i =0; i < input; i++){
            System.out.println("nomor produk : "+kode[i]);
            System.out.println("nama produk : "+ nama[i]);
            System.out.println("harga produk : "+harga[i]);
            System.out.println("stock produk : "+stock[i]);
            System.out.println("nilai produk : "+value[i]);
        }
    }
}
