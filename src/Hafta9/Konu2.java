package Hafta9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Konu2 {
    public static void main(String[] args) throws IOException {

        File dosya = new File("ilk.txt");

        FileReader okuyucu = new FileReader(dosya);
        BufferedReader bfOkuyucu = new BufferedReader(okuyucu);
        String satir = bfOkuyucu.readLine();

        while(satir != null){
            System.out.println(satir);
            satir = bfOkuyucu.readLine();
        }
        bfOkuyucu.close();
    }
}
