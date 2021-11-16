package Hafta2;

public class Konu2Devam {

    public static void main(String[] args) {

/*       //kuvvet alma
        int i = 0; //i, j, k, l, m, n
        int kuvvet = 10;// 2*2*2*2*2*2*2*2*2*2
        double sonuc = 1;
        while(i < 100){
            sonuc = sonuc * kuvvet;
        i++;
        }
        System.out.println("2^10 = " + sonuc);
        */
/*
        int i = 0; //i, j, k, l, m, n
        int kuvvet = 2;// 2*2*2*2*2*2*2*2*2*2
        double sonuc = 1;

        do{
            sonuc = sonuc * kuvvet;
        }while((++i)<10);
        System.out.println("2^10 = " + sonuc);//1024
        */
        //faktoriyel hesabı
        //4! = 4 * 3 * 2 * 1
        //4! = 1 * 2 * 3 * 4
        int faktor = 8;
        double sonuc = 1;
        for(int i = 1; i <= faktor; i++){
            sonuc *= i; // sonuc = sonuc * i
        }
        System.out.println(sonuc);
    }
}
