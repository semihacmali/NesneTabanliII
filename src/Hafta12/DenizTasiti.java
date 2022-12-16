package Hafta12;

public class DenizTasiti extends Tasit{
    String kullanimTuru;
    int uzunluk;

    DenizTasiti(String kullanimTuru, int uzunluk, int hiz, String vitesTuru){
        super(hiz, vitesTuru); // super(....) -> parent classtaki constructor i cagirir
        this.kullanimTuru = kullanimTuru;
        this.uzunluk = uzunluk;
    }

    public DenizTasiti(String yakitTuru, int hiz, String vitesTuru, String kullanimTuru, int uzunluk) {
        super(yakitTuru, hiz, vitesTuru);
        this.kullanimTuru = kullanimTuru;
        this.uzunluk = uzunluk;
    }

    public String getKullanimTuru() {
        return kullanimTuru;
    }

    public void setKullanimTuru(String kullanimTuru) {
        this.kullanimTuru = kullanimTuru;
    }

    public int getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(int uzunluk) {
        this.uzunluk = uzunluk;
    }

    public void info(){
        super.info(); // super. -> parent classtaki metot veya degiskenleri cagirir
        System.out.println("Deniz Tasitinin Kullanim Turu :" + this.kullanimTuru +
                "\nUzunluk : " + this.uzunluk);
    }
}
