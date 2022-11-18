package Hafta8;

public class Insan {
    String isim;
    int dogumTarihi;
    float kilo;
    int boy;

    void Yasamak(){
        System.out.println("Her insan yaşar.");
    }
    void info(){
        System.out.println("Bu nesnenin Adı : " + this.isim); // this komutu olusmamis nesnenin icerisindeki degiskeni kullanmamiza yarar.
    }

}
