package Hafta9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Konu1 {

    public static void main(String[] args) throws IOException {
        char harf = 'y';




        File dosya = new File("ilk.txt");
        if(!dosya.exists()){
            dosya.createNewFile();
        }

        //append kismi true oldugunda dosya icindeki veriler korunarak uzerine yazilir
        //append kismi false oldugunda dosya icerigi tamamen temizlenir ve yeniden icerik yazilir.
        FileWriter yazici = new FileWriter(dosya, false);
        float a = 20.2f;
        float b = 10.4f;
        topla(yazici, a, b);
        cikarma(yazici, a, b);
        yazici.close();


    }

    static void topla(FileWriter yazici , float a, float b) throws IOException {
        float sonuc = a + b;
        yazici.write(" " + a + "\n " + b + "\n+____" + "\n " + sonuc + "\n");
    }
    static void cikarma(FileWriter yazici , float a, float b) throws IOException {
        float sonuc = a - b;
        yazici.write(" " + a + "\n " + b + "\n-____" + "\n " + sonuc + "\n");
    }



}
