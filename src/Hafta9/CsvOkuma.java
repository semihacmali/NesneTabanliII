package Hafta9;

import java.io.*;

public class CsvOkuma {
    public static void main(String[] args) throws IOException {

        File dosya = new File("iris.csv");
        FileReader okuyucu = new FileReader(dosya);
        BufferedReader bfOkuyucu = new BufferedReader(okuyucu);
        String satir = bfOkuyucu.readLine();
        String satirDeger[];

        while (satir != null){
            System.out.println(satir);
            //Split fonksiyonu regex degerine gore 
            // verilen Stringi ifadeyi parcalar
            satirDeger = satir.split(",");
            System.out.println(satirDeger[2]);
            satir = bfOkuyucu.readLine();
        }


    }
}
