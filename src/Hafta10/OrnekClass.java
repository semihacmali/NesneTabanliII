package Hafta10;

public class OrnekClass {
    /*
    Banka adında bir class olacak. Bu class String türünde bankanın adı ve türü(Katılım veya Yatırım)
    olarak iki değişkeni olacak ve bunlar için constructer(Yapıcı) kurulacak.

    BankaHesabi adinda bir alt class olacak ve Banka classında türetilecek.String türünde Hesap Sahibinin adı,
    String türünde Para Birimi(₺, $, £) olsun. Float türünde Hesap Bakiyesi olacak.

    BankaHesabi classı oluşturulurken iki farklı contructer(Yapıcı) oluşturulacak. Bunlar;
    1- Bankanın adı, banka türü, hesap sahibinin adı, hesap bakiyesi olacak. Banka adı ve Banka türü Banka Class'ının
    constructer(Yapıcı) ile tanımlanacak. Para Birimi girilmediği için ₺ olarak atanacak.
    2- Hesap sahibinin adı, Banka Adı, Para Birimi, Hesap Bakiyesi olacak şekilde oluşturulacak.


    Para Birimleri arasında Dönüşüm fonksiyonu tanımlanacak. Dönüştürülecek Para Birimini girdi olarak alacak.
    $ = 12,91 £ = 14,58
    (Aynı para birimleri arasında dönüşüm yapmasını engelle.( $ 'dan $'a dönüşümde herhangi bir değişiklik olmaz.))

    Hesaba Para Yatırma Fonksiyonu tanımlanacak. Girdi olarak Para miktari ve Para Birimi girilmeli.
    Eğer Para Birimleri aynı değilse Para Birimi Dönüşümü yapılmalıdır.
    Hesap Bakiyesinin Güncellenmesi lazım


    Hesaptan Para Çekme Fonksiyonu tanımlanacak. Girdi olarak Para miktari ve Para Birimi girilmeli.
    Eğer Para Birimleri aynı değilse Para Birimi Dönüşümü yapılmalıdır.
    Eğer Bakiye Çekilmek istenen miktardan daha azsa "Yeterli Bakiyeniz Yok!"
    Hesap Bakiyesinin Güncellenmesi lazım


    ÖZET fonksiyonu olsun. Bu fonksiyon girdi olarak birşey almasın ancak
    Hesap sahibinin adı, Banka Adı, Para Birimi, Hesap Bakiyesi Ekrana yazdırsın.
     */

    public static void main(String[] args) {

        BankaHesabi mert = new BankaHesabi("A", "Katilim", "MERT", 0);
        //mert.ozet();
        mert.paraYatirma(1, '₺');
        mert.ozet();
        mert.paraYatirma(50, '£');
        mert.ozet();
        //mert.paraCekme(60, '£');
        mert.paraCekme(100, '₺');
        mert.ozet();
        mert.paraCekme(50,'$');
        mert.Donusturucu('$');
        mert.Donusturucu('₺');
        mert.Donusturucu('£');


    }

}
