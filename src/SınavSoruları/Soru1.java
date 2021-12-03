package SınavSoruları;

public class Soru1 {

    public static void main(String[] args) {

        //Ekran Ciktisi

/*
        int i = 2;
        do {
            System.out.println(i+"x"+ ++i +"="+ i*++i);
        } while (i<10);
*/

    }
    // float[] arit = {3, 6, 2, 5.2f, 9};
    // verilen dizinin aritmatik ortalamasını alan fonksiyonu yazınız.
    public static float aritmatikOrtalama(float[] arit){
        float toplam = 0;
        for(int i = 0; i < arit.length; i++){
            toplam = toplam + arit[i];
        }
        float sonuc;
        sonuc = toplam / arit.length;
        return sonuc;
    }
    // Numarasının sonu çift olanlar Kabarcık siralama algoritmasının çalışma adımlarını,
    // Numarasının sonu tek olanlar Seçmeli siralama algoritmasının çalışma adımlarını yazınız.


    // Kuvvet alma recursive(özyinelemeli) fonksiyonu yazınız.
    // Örneğin; recursiveKuvvet(2, 3) fonksiyonun çıktısı 8 olacak
    public static double recursiveKuvvet(int sayi, int kuv){
        if(kuv <= 0){
            return 1;
        }
        else{
            return sayi * recursiveKuvvet(sayi,kuv-1);
        }
    }
}
