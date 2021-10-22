package Hafta1;

import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {
        /*
        Girdi Olarak 2 adet Double sayi alınacak
        İşlem olarak + - * / işlemlerinden birini girdi olarak alınacak
        / işleminde 0 ile bölünememezlik kuralı
        bu seçilen işleme göre işlem sonucunu ekranı yazdıracaksınız
        eğer kullanıcı + - * / işlemlerinde farklı bişey girerse hata mesajı versin

        kullanıcı islem giriniz kısmında 'e' değerini girmezse tekrar çalışmalı
        kullanıcı islem giriniz kısmında 'e' değerini girerse işlemi sonlandırmalı

        for veya while dongusu kullanmalısınız veya
        break ve continue komutlarıyla da yapılabilir.

         */

        Scanner scan = new Scanner(System.in);
        char islem = 'h';
        while(islem != 'e') {

            System.out.print("İlk Sayiyi Giriniz :");
            double sayi1 = scan.nextDouble();
            System.out.print("İkinci Sayiyi Giriniz :");
            double sayi2 = scan.nextDouble();
            System.out.print("İslemi Giriniz (+, -, *, /, 'e') :");
            islem = scan.next().toCharArray()[0];

            if (islem == '+') {
                System.out.println("Sonuc = " + (sayi1 + sayi2));
            } else if (islem == '-') {
                System.out.println("Sonuc = " + (sayi1 - sayi2));
            } else if (islem == '*') {
                System.out.println("Sonuc = " + (sayi1 * sayi2));
            } else if (islem == '/') {
                if (sayi2 == 0) {
                    System.out.println("Tanimsiz");
                } else {
                    System.out.println("Sonuc = " + (sayi1 / sayi2));
                }
            } else {
                System.out.println("Gecersiz Islem Girdiniz....");
            }

            System.out.println("İslemi Bitirmek istiyorsanız 'e' ye basiniz");
            islem = scan.next().toCharArray()[0];
        }

    }
}
