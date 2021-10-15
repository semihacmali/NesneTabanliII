package Hafta1;

import java.util.Scanner;

public class Konu1 {

    public static void main(String[] args) {

        // Ekran Çıktısı Alma
/*
        System.out.print("Hello World!:))\n");
        System.out.print("Merhaba");
*/
        // Değişken atama
/*

        int sayi1 = 8;

        double sayi2 = 1.5;

        System.out.println(sayi1 + sayi2);
        double sonuc;
        sonuc = sayi1 + sayi2;

        System.out.println( sonuc);
*/
        // String İşlemleri
  /*
        int sayi1 = 8;
        String ad = "semih";
        String soyad = "acmali";
        // String ve int değerin stringe çevirerek ekleme işlemi
        String isim1 = ad + sayi1;
        System.out.println(isim1);

        String isim = ad + " " + soyad;
        System.out.println(isim);

        String kelime = "Yüksek\n" +
                "İhtisas" +
                "\tÜniversitesi\\";
        System.out.print(kelime);
*/

        Scanner girdi = new Scanner(System.in);
        System.out.print("İlk Sayiyi Giriniz : ");
        int sayi1 = girdi.nextInt();
        System.out.print("İkinci Sayiyi Giriniz : ");
        int sayi2 = girdi.nextInt();
        System.out.print("İslemi Giriniz : ");
        char islem = girdi.next().toCharArray()[0];

        if(islem == '/'){
            System.out.print(sayi1 / sayi2);
        }else{
            System.out.print("Hatali İslem Girdiniz...");
        }



    }
}
