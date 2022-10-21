package Hafta3;

public class Fonksiyonlar {

	/*
		Zaman Karmasikligi Hesaplama;
		1- Her zaman en kotu durum goz onune alinir.
		2- Hesaplamada donguler veya dongu olusturan ogeler dikkate alinir ve dongunun kac kere dondugu burada en onemli durumdur. 
		3- Yazilan kod blogunda eğer if bloklari var ise 1. kural dikkate alinir ve en uzun islemi yapan if bloguna gore hesaplama yapılır.		
	*/
    public static int basamakDegerleri(int sayi){
		

		
        //sayi = 523  cikti = 5 + 2 + 3
        int sonuc = 0;
        int basamak = 0;
        if(sayi < 0 ){
            sayi = sayi * -1;
        }
		// Karmasiklik hesaplanirken buradaki dongu hesaba katilir.
		// iceride yapilan islemler icerisinde 2. bir dongu olmadigindan bu dongunun kaç tekrar yaptigi hesaplanmalidir.
		// buradaki dongu basamak degeri kadar tekrar yapar.
        while(sayi >= 10){
            basamak = sayi % 10;
            sonuc = sonuc + basamak;
            sayi = sayi / 10; //sayi = 523/10 = 52
                              // sayi = 52/10 = 5
        }
        sonuc = sonuc + sayi;
        return sonuc;

    }

    // [ 1, 2, 4 ,6 ,7 ] 5/2 = 2 6/2 = 3
    public static void ortancaDeger(int sayi[]){
        int enBuyuk = sayi[0];
        int buyukIndex = 0;
        // En buyuk sayiyi bulma
        for(int i = 1; i < sayi.length; i++){
            if(enBuyuk < sayi[i]){
                enBuyuk = sayi[i];
                buyukIndex = i;
            }
        }
        int ortaIndex = sayi.length/2;
        int gecici = sayi[ortaIndex];
        sayi[ortaIndex] = enBuyuk; // [ 1, 2, 7 ,6 ,7 ]
        sayi[buyukIndex] = gecici; // [ 1, 2, 7 ,6 ,4 ]
        for(int deger:sayi){
            System.out.print(deger + "\t");
        }
    }

    public static float aritmatikOrtalama(float[] arit){
       // float[] arit = {3, 6, 2, 5.2f, 9};
        float toplam = 0;
        for(int i = 0; i < arit.length; i++){
            toplam = toplam + arit[i];
        }
        float sonuc;
        sonuc = toplam / arit.length;
        return sonuc;
    }
	// void olmasi geriye deger dondurmedigi anlamina gelmektedir
	
	public static void faktoriyelHesaplama(int deger){
		if(deger < 0){
            System.out.println("Negatif sayilarin faktöriyeli hesaplanamaz.");
        }
        else if(deger == 1 || deger == 0){
            System.out.println(deger + "! = " + 1);
        }
        else{
            double sonuc = 1; // carpma isleminin etkisiz elemani oldugu icin 
            for(int i = 2; i <= deger; i++){
                sonuc *= i;
            }
            System.out.println(deger + "! = " + sonuc);
        }
	}
	
	 public static double ustalma(int alt, int ust){
        double sonuc = 1;
        for(int i = 0; i < ust;i++){
            sonuc *= alt;
        }
         return sonuc;
    }
	
	
    public static void main(String[] args) {
		
		
		faktoriyelHesaplama(-5);
		System.out.println(ustalma(3,3));
		
/*   Sayinin basamak degerlerini hesaplar
        int deger = 125;
        int basamaksonuc = basamakDegerleri(deger);
        System.out.print(basamaksonuc);
        */

  /*    Dizinin en buyuk elemanini ortadaki indexle yer degistirir
        int[] dizi = { 1, 8, 2, 4 ,6 ,7 };

        ortancaDeger(dizi);
*/

/*      Float dizinin aritmatik ortalamasını hesaplar
        float[] array = {3, 6, 2, 5.2f, 9};
        float ortalama = aritmatikOrtalama(array);
        System.out.print(ortalama);

        */
    }
}
