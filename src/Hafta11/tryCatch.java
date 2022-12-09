package Hafta11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class tryCatch {

    public static void main(String[] args) {
        /*
        try: hata beklenen durumları icerisinde barındırır. burada olusan hatalar icin;
        catch : istenilen sayiya kadar olusturulabilir.
        "Exception" genel hataların hepsini kapsar ve ona gore islem yapar.
        "ArithmeticException" sadece matematiksel hatalar olustugunda calısır
        "InputMismatchException" sadece girdi eslesme hatalarında calisir. Örnek : int sayi = "asd";
        "finally" her zaman calisacak olan kisimdir
         */
        try{
            int doublebolunen, doublebolen, doublesonuc;
            Scanner sc=new Scanner(System.in);
            System.out.println("1.sayıyı girin:");
            doublebolunen=sc.nextInt();
            System.out.println("2.sayıyı girin:");
            doublebolen=sc.nextInt();
            doublesonuc=doublebolunen/doublebolen;
            System.out.println("Sonuç="+doublesonuc);

        }
        /*catch (ArithmeticException e1){
            System.out.println("Sayı Sıfır'a Bolunemez : " + e1);
        }*/
        catch (InputMismatchException e2){
            System.out.println("Lütfen Sayı Giriniz : " + e2);
        }
      /*  catch (Exception e3){
            System.out.println("Bir Hata olustu : " + e3);
        }*/
        finally {
            System.out.println("Islem Sonlandı");
        }



    }
}
