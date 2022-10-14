package Hafta2;

public class ArttirmaAzaltma {
    int k = 0;

    public static void main(String[] args) {

        //post-increment sonradan arttirma
        int i = 5;
        System.out.println(i++);//degiskenin sagina ++ ifadesi koyarsam.
        // ilk once yazdir sonra sayiyi arttir.
        // islemi yap sonraki satıra gecmeden arttir.
        System.out.println(i);
        i++;

        int j = 9;
        System.out.println(++j); // degisken soluna yazdigimizda ilk önce artirma islemini yap sonra diger islemi yap

        i = 1;
        int sayac = 0;
        while(i++ < 10){ // 10 - 1 kere calisiyor
            //int sayac = 0;
            sayac = sayac + 1;
        }
        // Java Garbage Collector (JGC)
        System.out.println("Sayac Ciktisi Arttirma Soldayken : "+ sayac);

        i = 1;
        sayac = 0;
        while(++i < 10){ // 10 - 1 - 1
            //int sayac = 0;
            sayac = sayac + 1;
        }
        System.out.println("Sayac Ciktisi Arttirma Sagdayken : "+ sayac);

        boolean mantik; // (true, false), (0, 1), (Dogru, Yanlis)
        mantik = (5 < 1) == true;

        System.out.println(mantik);

        i = 1;
        j = 4;
        while(i < j == true){
            System.out.println("i : " + i + "\tj : " + j);
            j = j + 1;
            i = i + 2;
        }
        System.out.println("i : " + i + "\tj : " + j);

        int m = 4;
        int n = 10;
        while(m < 10 && n < 15){ // && and(ve) islemi
        // while, for, do while gibi dongu islemleri sadece true sonuc uretildiginde calisir.
            // true && true = true
            // true && false = false
            // false && true = false
            // false && false = false
            System.out.println("m : " + m + "\tn : " + n);
            m = m + 3;
            n = n + 1;
        }
        System.out.println("m : " + m + "\tn : " + n);
        i = 6;
        j = 2;
        while(i < 10 || i > j ){ // || = OR(veya, yada) islemidir
            // true || true = true
            // true || false = true
            // false || true = true
            // false || false = false
            System.out.println("i : " + i + "\tj : " + j);
            i++;
            j = j + 3;
        }
        System.out.println("i : " + i + "\tj : " + j);
    }
}
