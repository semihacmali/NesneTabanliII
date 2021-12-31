package Hafta10;

public class BankaHesabi  extends Banka{

    String adi;
    char paraBirimi;
    float bakiye;


    BankaHesabi(String bankaAdi, String bankaTuru, String adi, float bakiye){
        super(bankaAdi, bankaTuru); //Banka adı ve Banka türü Banka Class'ınınconstructer(Yapıcı) ile tanımlanacak.
        this.adi = adi;
        this.bakiye = bakiye;
        this.paraBirimi = '₺'; //(₺, $, £)
    }

    BankaHesabi(String bankaAdi, String adi, char paraBirimi, float bakiye){
        this.bankaAdi = bankaAdi;
        this.adi = adi;
        this.paraBirimi = paraBirimi;
        this.bakiye = bakiye;
    }

    void Donusturucu(char donus){
        float dolar = 12.91f;
        float euro = 14.58f;

        if(this.paraBirimi == donus){
            System.out.println("Aynı tür para birimleri arasinda dönüsüm yapilamaz.");
        }else{
            if(donus == '$'){
                this.paraBirimi = donus;
                this.bakiye = this.bakiye / dolar;
            }else if(donus == '£'){
                this.paraBirimi = donus;
                this.bakiye = this.bakiye / euro;
            }else{
                if(this.paraBirimi == '$'){
                    this.paraBirimi = donus;
                    this.bakiye = this.bakiye * dolar;
                }else{
                    this.paraBirimi = donus;
                    this.bakiye = this.bakiye * euro;
                }
            }
            this.ozet();
        }
    }


    void paraYatirma(float yatirilacakTutar, char paraBirimi){//(₺, $, £)

        if(this.paraBirimi == paraBirimi){
            this.bakiye = this.bakiye + yatirilacakTutar;
        }else{
            this.Donusturucu(paraBirimi);
            this.bakiye = this.bakiye + yatirilacakTutar;
        }
    }

    void paraCekme(float cekilecekTutar, char paraBirimi){

        if(this.paraBirimi == paraBirimi){
            if(cekilecekTutar > this.bakiye){
                System.out.println("Hesabınızda yeterli bakiye yok!" +
                                   "\n Hesap Bakiyeniz : " + this.bakiye +
                                   "\n Cekme Istediginiz Tutar : " + cekilecekTutar);
            }else{
                this.bakiye = this.bakiye - cekilecekTutar;
            }
        }else{
            this.Donusturucu(paraBirimi);
            if(cekilecekTutar > this.bakiye){
                System.out.println("Hesabınızda yeterli bakiye yok!" +
                        "\n Hesap Bakiyeniz : " + this.bakiye +
                        "\n Cekme Istediginiz Tutar : " + cekilecekTutar);
            }else{
                this.bakiye = this.bakiye - cekilecekTutar;
            }
        }
    }

    void ozet(){
        System.out.println("Hesap Sahibinin Adi : " + this.adi +
                           "\nBanka Adi : " + this.bankaAdi +
                           "\nPara Birimi : " + this.paraBirimi +
                           "\nHesap Bakiyesi : " + this.bakiye);
    }

}
