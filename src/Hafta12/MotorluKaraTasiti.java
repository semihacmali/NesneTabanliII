package Hafta12;

import java.util.Calendar;

// crtl+shift+alt+l -> format duzenleyici
public class MotorluKaraTasiti extends KaraTasiti {
    String cekisTuru;
    int motorHacmi; // cc cinsinden yazilmasi lazim 1600, 2500
    int KM;
    String kasaTipi;
    int cikisTarihi;

    public MotorluKaraTasiti(String cekisTuru, int motorHacmi, int KM, String kasaTipi, int cikisTarihi) {
        this.cekisTuru = cekisTuru;
        this.motorHacmi = motorHacmi;
        this.KM = KM;
        this.kasaTipi = kasaTipi;
        this.cikisTarihi = cikisTarihi;
    }

    public MotorluKaraTasiti(String yakitTuru, int hiz, String vitesTuru, int tekerlekSayisi, Boolean direksiyonKonumu, String cekisTuru, int motorHacmi, int KM, String kasaTipi, int cikisTarihi) {
        super(yakitTuru, hiz, vitesTuru, tekerlekSayisi, direksiyonKonumu);
        this.cekisTuru = cekisTuru;
        this.motorHacmi = motorHacmi;
        this.KM = KM;
        this.kasaTipi = kasaTipi;
        this.cikisTarihi = cikisTarihi;
    }

    public MotorluKaraTasiti(int hiz, String vitesTuru, int tekerlekSayisi, Boolean direksiyonKonumu, String cekisTuru, int motorHacmi, int KM, String kasaTipi, int cikisTarihi) {
        super(hiz, vitesTuru, tekerlekSayisi, direksiyonKonumu);
        this.cekisTuru = cekisTuru;
        this.motorHacmi = motorHacmi;
        this.KM = KM;
        this.kasaTipi = kasaTipi;
        this.cikisTarihi = cikisTarihi;

    }

    public String getCekisTuru() {
        return cekisTuru;
    }

    public void setCekisTuru(String cekisTuru) {
        this.cekisTuru = cekisTuru;
    }

    public int getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(int motorHacmi) {
        this.motorHacmi = motorHacmi;
    }

    public int getKM() {
        return KM;
    }

    public void setKM(int KM) {
        this.KM = this.KM + KM;
    }

    public String getKasaTipi() {
        return kasaTipi;
    }

    public void setKasaTipi(String kasaTipi) {
        this.kasaTipi = kasaTipi;
    }

    public int getCikisTarihi() {
        return cikisTarihi;
    }

    public void setCikisTarihi(int cikisTarihi) {
        this.cikisTarihi = cikisTarihi;
    }

    public int toplamYil(){
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return year - this.cikisTarihi;
    }

    public float ortalamaKM(){
        return this.KM/toplamYil();
    }

    public void info(){
        super.info();
        System.out.println("Aracin Toplam Km : " + getKM() +
                "\nTrafikteki Toplam Yılı : " + toplamYil() +
                "\nYıldaki Ortalama KM : " + ortalamaKM());
    }


}
