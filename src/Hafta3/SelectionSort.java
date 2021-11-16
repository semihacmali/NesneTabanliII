package Hafta3;

public class SelectionSort {

    public static int[] kabarcıkAlgoritmasi(int[] intDizi) {
        int n = intDizi.length;
        int temp = 0;

        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){

                if(intDizi[j-1] < intDizi[j]){
                    temp = intDizi[j-1];
                    intDizi[j-1] = intDizi[j];
                    intDizi[j] = temp;
                }

            }
            for(int k = 0; k < intDizi.length;k++)
                System.out.print(intDizi[k]+ "\t");
            System.out.println();
        }
        return intDizi;
    }
    private static void kabarcıkAlgoritmasıTersten(int[] intTersdizi) {
        int n = intTersdizi.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (intTersdizi[j - 1] < intTersdizi[j]) {
                    temp = intTersdizi[j - 1];
                    intTersdizi[j - 1] = intTersdizi[j];
                    intTersdizi[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {/*
// bazen psvm gözükmüyor elle yazmam gerekiyor çözümünü bulamadım hocam.Bu koduna araştırdım birşey elde edemedim.Yardımcı olursanız bu konu hakkında sevinirim :)
        int[] dizi = {89, 45, 15356, 25485, 23, 8}; //Dİzilerimi oluşturduk ve int olarak atadık.Tam sayı değerlerimizi girdik.
//döngüsünün özelliği kullanılarak dizi değerleri aldık.
        *//*1.FOR DÖNGÜSÜ *//*
        for (int i = 0; i < dizi.length; i++) { //Dizinin ilk verisini i=0 olarak atadık dizi.length-1 komutu kullanılarak dizinin bütün değerlerini alacağız.
// int sayi = dizi[i] komutu ile değerler sayı değişkenine göre atamasını yapıyoruz.
            int sayi = dizi[i];
            //int geçici_deger = i ise belirtilen sayının dizideki indeksi geçici ,geçici değer olarak kaydeder.
            int gecici_sayi= i;
            *//*2.FOR DÖNGÜSÜ *//*
            for (int j = i + 1;j <dizi.length; j++) { //ikinci for döngüsünde ise dizideki i teriminden sonraki elemanlara bakarak dizi uzunluğunca işlemi yaptırdık.

                if (dizi[j]<sayi){
                    sayi =dizi[j];
                    gecici_sayi = j;

                }
                if (gecici_sayi !=1){
                    dizi[gecici_sayi] = dizi[i];
                    dizi[i]=sayi;
                    //dizinin ilk sayı en küçük öge kabul ederek başlar.
                    //Sonra diğer sayılara e bakarak bu veriler arasında, seçilen sayıdan daha küçük bir sayı varsa bu sayı en  başa koyulur.
                    //dizimizden en küçük sayı bulunduktan sonra kalan diziye tekrar 1.for döngüsündeki  işlem uygulanır.
                    //Kalan diziden seçilen en küçük sayıyı, ilk seçilen sayının yanına koyar. Böylece sayılar soldan sağa doğru küçükten büyüğe doğru sıralanmaya başlar.

                }
                //Eldeki sayıdan daha küçük değerde sayı varsa sayı değişkeni ve indeksi değiştirilerek işlemler(dizimizdeki 40 sayısına kadar yada en büyük sayıya kadar devam eder.)

            }
            for(int k = 0; k < dizi.length;k++){
                //Boolean ile (":") birbirine çevililebilen ifadeler  yada aynı tip ifadeler olduğu için bu for döngümüzdede gelen sayı dizideki sayılarımızla true olana kadar devam eder.
                // false ise dizilerimizdeki sayıyla aynı değilse atlar true ise ekrana yazdırır.
                System.out.print(dizi[k] + "\t");

                *//* MUSTAFA ÖZDEMİR*//*
                *//*ÖĞRENCİ NO : 2005010019 *//*

            }
            System.out.println();
            *//*3.FOR DÖNGÜSÜ *//*
        }for(int sayi:dizi){
            //Boolean ile (":") birbirine çevililebilen ifadeler  yada aynı tip ifadeler olduğu için bu for döngümüzdede gelen sayı dizideki sayılarımızla true olana kadar devam eder.
            // false ise dizilerimizdeki sayıyla aynı değilse atlar true ise ekrana yazdırır.
            System.out.print(sayi + "\t");

            *//* MUSTAFA ÖZDEMİR*//*
            *//*ÖĞRENCİ NO : 2005010019 *//*

        }*/
        int[] dizi = {89, 45, 15356, 25485, 23, 8};

        dizi = kabarcıkAlgoritmasi(dizi);
        for(int sayi:dizi){
            //Boolean ile (":") birbirine çevililebilen ifadeler  yada aynı tip ifadeler olduğu için bu for döngümüzdede gelen sayı dizideki sayılarımızla true olana kadar devam eder.
            // false ise dizilerimizdeki sayıyla aynı değilse atlar true ise ekrana yazdırır.
            System.out.print(sayi + "\t");}

    }
}
