package Hafta8;

public class Araba extends Kategori{

    KapiSayisi kapiSayısı;
    float motorGucu;
    int beygir;
    //kategori ad = model
    Araba(String model, String aciklama, int adet,
          int kapiSayısı, float motorGucu, int beygir, double fiyat){
        //super(); Kurtarma Consturactor'ini çagirir.
        super(model, aciklama);


        //this.kategoriAd = model;
        //this.aciklama = aciklama;
        this.adet = adet;
        this.beygir = beygir;
        this.motorGucu = motorGucu;
        this.kapiSayısı = new KapiSayisi(kapiSayısı);
       this.fiyat = fiyat;
    }
    Araba(int adet, double fiyat){
        this.adet = adet;
        this.fiyat = fiyat;
    }
    Araba(String model, String aciklama, int adet, double fiyat){
        this(adet, fiyat);
        this.kategoriAd = model;
        this.aciklama = aciklama;
    }

    //Ayni degisken turune ve sirasina sahip 1'den fazla constructor olusturulamaz.
    //Ancak farkli sirada degisken turu iceren olusturulabilir.
    Araba(String model, int adet, String aciklama, double fiyat){
        this(adet, fiyat);
        this.kategoriAd = model;
        this.aciklama = aciklama;
    }

    public void info(){
        System.out.println("Araba Adı : " + this.kategoriAd +
                           "\nKapi Sayisi" + this.kapiSayısı.getKapiSayisi()+
                           "\nArabanin Fiyati : " + this.fiyat);
    }



}
