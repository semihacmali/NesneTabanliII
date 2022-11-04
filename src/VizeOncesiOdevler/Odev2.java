package VizeOncesiOdevler;

public class Odev2 {
    public static void main(String[] args) {
       // MukemmelSayi();
        ArmstrongSayıları();

    }
    public static void MukemmelSayi(){
        for(int i=1;i<=10000;i++){
            int toplam=0;
            for(int j=1;j<i;j++){
                if(i%j==0){
                    toplam=toplam+j;
                }
            }
            if(toplam==i){
                System.out.println(i+ " Sayısı Bir Mükemmel Sayıdır.");
            }
        }
    }

    public static void ArmstrongSayıları(){
        int sayac = 1;
        int []dizi = new int [5];
        for(int i = 10; i < 10000; i++){
            sayac = 1;
            int n = i;
            while(n >= 10){
                dizi[sayac] = n % 10;
                sayac++;
                n = n /10;
            }
            dizi[sayac] = n;
            int sonuc = 0;
            for(int j = 0; j <= sayac; j++){
                sonuc = sonuc + Recursiveustalmalogn(dizi[j], sayac);
            }
            if(sonuc == i){
                System.out.println(i + ". eleman Armstrong Sayisidir.");
            }
        }


    }
    public static int Recursiveustalmalogn(int alt, int ust){
        if(ust <= 1){
            return alt;
        }
        else {
            if (ust % 2 == 0) {
                int sonuc = Recursiveustalmalogn(alt, ust / 2);
                return sonuc * sonuc;
            } else {
                int sonuc = Recursiveustalmalogn(alt, (ust - 1) / 2);
                return alt * sonuc * sonuc;
            }
        }
    }
}
