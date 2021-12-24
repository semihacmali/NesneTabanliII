package Hafta9;

import java.io.*;

public class DosyaKopyalama {
    public static void main(String[] args) throws IOException{
        //kopyalanacak dosya
        File dosya1 = new File("ilk.txt");
        // kopyalanacak yer
        File dosya2 = new File("ikinci.txt");
        // kopyalanacak dosyanın okuyucusu
        FileReader okuyucu = new FileReader(dosya1);
        BufferedReader bfOkuyucu = new BufferedReader(okuyucu);
        // yazdirilacak dosyanın yazicisi
        FileWriter yazici = new FileWriter(dosya2);

        String satir = bfOkuyucu.readLine();
        while(satir != null){
            yazici.write(satir + "\n");
            satir = bfOkuyucu.readLine();
        }
        //acilan tum ifadeler kapatilmalidir
        yazici.close();
        bfOkuyucu.close();

    }
}
