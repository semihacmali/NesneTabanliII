package Hafta8;

public class MetotSinifNesne {
    private static String[] args;
    private static int sayi1;

    public static void main(String[] args){
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

        Insan bora = new Insan();
        bora.isim = "Bora";
        bora.kilo = 75;
        bora.boy = 165;
        bora.dogumTarihi = 2002;
        bora.info();


    }

    public static void carpma(int a, int b){
        System.out.println(a * b);
    }
}
