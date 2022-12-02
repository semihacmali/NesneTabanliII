package Hafta8;
//bir belirtec yok ise public'tir.
//private = olusturulan nesne de dahil olmak uzere kendi sinifi disinda cagirilamaz.
//protected = olusturulan nesne be alt siniflar erisebilir.
//public = projenin her yerinden erisilebilir.

public class Insan {
    String isim;
    protected int dogumTarihi;
    float kilo;
    private int boy;

    // Constructors(Yapıcılar) türü olmayan metodlardir. Sınıfın adı neyse o ad ile olusturulur
    Insan(){ // Default Constructor(Varsayılan Yapıcı)
             // default constructor olmadan diger constructor'lar uretilemez.
        isim = "Girilmedi";
        dogumTarihi = -1;
        kilo = -1.0f;
        boy = -1;
    }

    Insan(String isim){
        this.isim = isim; //this komutu, bu sinifin icerisindeki degiskene erismemizi sagliyor.
    }

    Insan(String isim, int dogumTarihi, float kilo){
        this.isim = isim;
        this.dogumTarihi = dogumTarihi;
        this.kilo = kilo;
    }

    Insan(String isim, float kilo, int boy){ // degiskenlerin isimlerinin farkli olmasi metodu farklilastirmaz.
                                             // farkliligi degisken türleri olusturur.
        this.isim = isim;
        this.boy = boy;
        this.kilo = kilo;
    }

    Insan(String isim, int dogumTarihi, float kilo, int boy){
        this(isim, kilo, boy); // farkli bir constructor cagirilacaksa bu ilk satirda olmalidir.
        //this.isim = isim;
        this.dogumTarihi = dogumTarihi;
        //this.kilo = kilo;
        //this.boy = boy;

    }

    protected void Yasamak(){
        System.out.println("Her insan yaşar.");
        info();
    }
    private void info(){
        System.out.println("Bu nesnenin Adı : " + this.isim); // this komutu olusmamis nesnenin icerisindeki degiskeni kullanmamiza yarar.
    }


}
