package Hafta5;

import java.text.DecimalFormat;

public class Karmasiklik {

    public static void main(String[] args) {
  /*      int n = 10, sayac = 0;
        for(int i = 0; i < n; ++i){ // for u 11 kere kontrol etti
            sayac++;
        }
        System.out.println(sayac);

        n = 20;
        sayac = 0;
        for(int i = 0; i < 20; i++){ // for u 21 kere kontrol etti.
            sayac++;
        }
        System.out.println(sayac);

        // for dongusunun sorgu sayisi ; n - i + 1 (sayma sayisi sayisi)

        sayac = 0;
        for(int i = 20; i < 20; i++){ // for u 21 kere kontrol etti.
            sayac++;
        }
        System.out.println(sayac);

        int dizi[] = [[1,5,6,2,7,8,9],
                      [12,56,12,32,45]]; 2x3

            */

            // 2^16 nun karmaşıklığı 16
            // 2^16 nun karmaşıklığı 4
        int taban = 2;
/*        int ust = 16;
        int sonuc = 1;
        //2*2*2*2*2*2*2*2*2*2
        for(int i = 1; i <= ust; i++) {
            sonuc = sonuc * taban;
        }
        System.out.println(sonuc);
        long timebegin = System.currentTimeMillis();
        System.out.println(Recursiveustalma(2,1000));
        long timeend = System.currentTimeMillis();
        System.out.println(Recursiveustalmalogn(2,1000));
        long timeend2 = System.currentTimeMillis();
        System.out.println("İteratif Süre " + new DecimalFormat("##.#########").format((timeend - timebegin)));
        System.out.println("Recursive Süre " + new DecimalFormat("##.#########").format((timeend2 - timeend)));

        */

        System.out.println(DecimaltoBinary(267));


    }
    // iteratif fonksiyon (sadece girdi işlem ve sonuc üretir)
    public static double ustalma(int alt, int ust){
        double sonuc = 1;
        for(int i = 0; i < ust;i++){
            sonuc *= alt;
        }
        return sonuc;
    }
    public static double Recursiveustalma(int alt, int ust){
        if(ust <= 1){
            return alt;
        }else{
            return alt * Recursiveustalma(alt, ust-1);
        }
    }
    public static double Recursiveustalmalogn(int alt, int ust){
        if(ust <= 1){
            return alt;
        }
        else {
            if (ust % 2 == 0) {
                double sonuc = Recursiveustalmalogn(alt, ust / 2);
                return sonuc * sonuc;
            } else {
                double sonuc = Recursiveustalmalogn(alt, (ust - 1) / 2);
                return alt * sonuc * sonuc;
            }
        }
    }

    public static String DecimaltoBinary(int decimal){
        String sonuc = "";
        if(decimal <= 1) {
            return Integer.toString(decimal);
        }
        else{
            return DecimaltoBinary(decimal/2) + Integer.toString(decimal % 2) ;
        }
    }

}
