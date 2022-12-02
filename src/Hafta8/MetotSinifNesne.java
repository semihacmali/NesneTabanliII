package Hafta8;

public class MetotSinifNesne {
    private static String[] args;
    private static int sayi1;

    public static void main(String[] args){
 /*     Hafta 8
        MetotSinifNesne.args = args; //arguments = degiskenler/argumanlar
        //String gelendeger1 = args[0];
        System.out.println("deneme");
        MetotSinifNesne.carpma(5, 3); // default parametre atama islemi yoktur. Geleneksel yontemlerle yoktur.
        int a = 10;
        Insan semih = new Insan();
        semih.isim = "Semih";
        semih.kilo = 80.0f;
        semih.boy = 170;
        semih.dogumTarihi = 1992;
        semih.Yasamak();
        semih.info();

        Insan bora = new Insan(); // sınıftan nesne olusturma aşaması
        bora.isim = "Bora"; // deger atamasi nesne olusturulduktan sonra yapılmıs
        bora.kilo = 75;// deger atamasi nesne olusturulduktan sonra yapılmıs
        bora.boy = 165;// deger atamasi nesne olusturulduktan sonra yapılmıs
        bora.dogumTarihi = 2002;// deger atamasi nesne olusturulduktan sonra yapılmıs
        bora.info();
        */
        // Hafta 10
 /*       Insan semih2 = new Insan(); // sınıftan nesne uretirken Constructor olup olmadigini kontrol eder.
                                    // eger varsa Constructor metodunu cagirir.
       // semih2.info();
        System.out.println("Dogum Tarihi : " + semih2.dogumTarihi);

        Insan batuhan = new Insan("Batuhan");
        //batuhan.info();
        if(batuhan.dogumTarihi == 0){ //javada integer bir degisken olusturulup deger atanmazsa degeri 0 olarak atanir.
            System.out.println("Dogum tarihi girilmemistir.");
        }else{
            System.out.println("Dogum Tarihi : " + batuhan.dogumTarihi);
        }
        */

        Yonetici sema = new Yonetici();
        sema.isim = "Sema";
        sema.dogumTarihi = 1991;
        sema.info();
        sema.Yasamak();

    }

    public static void carpma(int a, int b){
        System.out.println(a * b);
    }
}
