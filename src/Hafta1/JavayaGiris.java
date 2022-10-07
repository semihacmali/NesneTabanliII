package Hafta1;

import java.util.Scanner;

public class JavayaGiris {

    public static void main(String[] args) {

        /* Degisken Turleri
        char : Sadece tek bir karakteri degisken kabul eder.
        String : Herhangi bir metin ifadesinin degisken olarak kabul eder.
        int : tam sayiyi degisken olarak kabul eder.,
        float : ondalıklı sayiyi degisken olarak kabul eder.
        double : ondalıklı sayiyi degisken olarak kabul eder. Çok büyük sayilar icin kullanilir.
        boolean : True/False(Doğru/Yanlis)(0/1) olarak kabul edilen mantiksal degiskeni kullanir.
         */

        char karakter = 'g';
        //String ilkKelime = "123123";
        //System.out.println(Integer.MAX_VALUE); //2147483647
        //System.out.println(Float.MAX_VALUE); //3.4028235 E38
        //System.out.println(Double.MAX_VALUE); //1.7976931348623157 E308
        // Sayisal islemler
        int sayi1 = 23;
        float sayi2 = 2.6f;
        int sonuc;
        sonuc = (int)(sayi1 + sayi2); // bu tanim("(int)") toplama isleminin sonucunda bize tam sayi olarak ciktisini verir.
        System.out.println(sonuc); //25
        float sonuc2;
        sonuc2 = sayi1 + sayi2; // bu islemin sonucunda float bir sonuc elde edilir.
        System.out.println(sonuc2); //25.6
        float sonuc3;
        sonuc3 = sayi1 + sayi1;
        System.out.println(sonuc3); //46.0

        Scanner girdi = new Scanner(System.in); //Klavyeden deger okumak için kullanilir.

        double sonuc4;
        double sayi5 = girdi.nextDouble();
        double sayi6 = girdi.nextDouble();
        char islem = girdi.next().toCharArray()[0];
        System.out.println(islem);

        if(islem == '+'){
            sonuc4 = sayi5 + sayi6;
            System.out.println("Sonuc : " + sonuc4);
        }








    }
}
