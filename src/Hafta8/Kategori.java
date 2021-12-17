package Hafta8;

public class Kategori {

    String kategoriAd;
    String aciklama;
    int adet;
    double fiyat;

    public Kategori(String kategoriAd, String aciklama, int adet, double fiyat) {
        this.kategoriAd = kategoriAd;
        this.aciklama = aciklama;
        this.adet = adet;
        this.fiyat = fiyat;
    }

    public Kategori(String kategoriAd, String aciklama) {
        this.kategoriAd = kategoriAd;
        this.aciklama = aciklama;
    }

    public Kategori() {
        aciklama = "Ürün bilgisi Girilmedi.";
    }

    public void info(){
        System.out.println("Kategori Turu : " + this.kategoriAd +
                           "\nAciklama : " + this.aciklama +
                           "\nAdet : " + this.adet +
                           "\nFiyat : " + this.fiyat);
    }



}
