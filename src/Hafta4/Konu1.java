package Hafta4;

public class Konu1 {
                                //  5          3
    public static double kuvvet(int sayi, int kuv){
        double sonuc = 1;
        for(int i = 1; i <= kuv; i++){
            sonuc = sonuc * sayi;
        }
        return sonuc;
    }

    public static double recursiveKuvvet(int sayi, int kuv){
        if(kuv <= 0){
            return 1;
        }
        else{
            return sayi * recursiveKuvvet(sayi,kuv-1);
        }
    }
    public static double aritmatikToplama(int bitis){
        //1 + 2 + 3 + 4 + 5 + 6 + ... + bitis
        double sonuc = 0;
        for(int i = 1; i <= bitis; i++){
            sonuc = sonuc + i;
        }
        return sonuc;
    }
    public static double recursiveAritTop(int bitis){
        if(bitis == 1){
            return 1;
        }else{
            return bitis + recursiveAritTop(bitis-1);
        }
    }
    public static String binaryDonusum(int hexaSayi){
        if(hexaSayi <= 1){
            return Integer.toString(hexaSayi);
        }else{
            int mod = hexaSayi % 2;
            hexaSayi = hexaSayi / 2;
            return binaryDonusum(hexaSayi) + Integer.toString(mod);
        }
    }

    public static void main(String[] args) {

     /*   double sonuc = recursiveKuvvet(5,3);
        System.out.println(sonuc);
        */
        //System.out.println(recursiveAritTop(4));
        //System.out.println(binaryDonusum(128));

        String ad = "Semih";
        String soyad = "Acmali";
        String adsoyad = ad + soyad;


    }
}
