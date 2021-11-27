package Hafta5;

public class Konu1 {

    public static void main(String[] args) {
        // Temel nesne olusturma

        dogumYili dG = new dogumYili();

        System.out.println("dG Dogum gunu : " + dG.dogumgunu);

        dG.dogumgunu = 2000;

        System.out.println("dG Dogum gunu : " + dG.dogumgunu);

        dogumYili dG2 = new dogumYili();


        System.out.println("dG2 Dogum gunu : " +dG2.dogumgunu);


        // Temel nesne fonksiyonu kullanma


        dogumYili semih = new dogumYili();
        // Degisken degeri atanmazsa Sıfır(0) olarak alinir.
        System.out.println("Dogum gunu : " + semih.dogumgunu);
        System.out.println("Yas : " + semih.yas());

        semih.dogumgunu = 1000;
        System.out.println("Yas : " + semih.yas());




        Ucgen cesitkenar = new Ucgen(2, 3, 5);

        System.out.println("Ucgenin Cevresi : " + cesitkenar.cevreUzunlugu());

        Ucgen ikizkenar = new Ucgen(3, 5);
        System.out.println("Ucgenin Cevresi : " + ikizkenar.cevreUzunlugu());

        Ucgen eskenar = new Ucgen(6);
        System.out.println("Ucgenin Cevresi : " + eskenar.cevreUzunlugu());

        Ucgen bosucgen = new Ucgen();
        System.out.println("Ucgenin Cevresi : " + bosucgen.cevreUzunlugu());
    }


    static class Ucgen{
        int a;
        int b;
        int c;
        // cesitkenar ucgen icin
        Ucgen(int a, int b, int c){
            this.a = a;
            this.b = b;
            this.c = c;
        }
        //ikizkenar ucgen icin
        Ucgen(int a, int b){
            this.a = a;
            this.b = b;
            this.c = b;
        }
        //eskenar ucgen icin
        Ucgen(int a){
            this.a = a;
            this.b = a;
            this.c = a;
        }
        //kurtarma durumu
        Ucgen(){
            this.a = 0;
            this.b = 0;
            this.c = 0;
        }

        public int cevreUzunlugu(){
            int cevre = a + b + c;
            return cevre;
        }


    }

    static class dogumYili{

        int dogumgunu;

        public int yas(){
            int sonuc = 2021 - dogumgunu;
            return sonuc;
        }

    }
}
