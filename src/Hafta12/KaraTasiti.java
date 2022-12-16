package Hafta12;

public class KaraTasiti extends Tasit{
    int tekerlekSayisi;
    Boolean direksiyonKonumu;// False -> Sağ, True -> Sol

    public KaraTasiti(){
        super();
        this.tekerlekSayisi = 0;
        this.direksiyonKonumu = false;
    }
    public KaraTasiti(String yakitTuru, int hiz, String vitesTuru, int tekerlekSayisi, Boolean direksiyonKonumu) {
        super(yakitTuru, hiz, vitesTuru);
        this.tekerlekSayisi = tekerlekSayisi;
        this.direksiyonKonumu = direksiyonKonumu;
    }

    public KaraTasiti(int hiz, String vitesTuru, int tekerlekSayisi, Boolean direksiyonKonumu) {
        super(hiz, vitesTuru);
        this.tekerlekSayisi = tekerlekSayisi;
        this.direksiyonKonumu = direksiyonKonumu;
    }

    public int getTekerlekSayisi() {
        return tekerlekSayisi;
    }

    public void setTekerlekSayisi(int tekerlekSayisi) {
        this.tekerlekSayisi = tekerlekSayisi;
    }

    public String getDireksiyonKonumu() {
        String konum = (direksiyonKonumu == true) ? "Sol":"Sağ"; // (Karsilastirma) ? DogruysaDeger:YanlissaDeger
        return konum;
    }

    public void setDireksiyonKonumu(String konum) {
        boolean direksiyonKonumu = (konum == "Sağ") ? false:true;
        this.direksiyonKonumu = direksiyonKonumu;
    }

    public void info(){
        super.info();
        System.out.println("Aracin Direksiyon Konumu : " + this.getDireksiyonKonumu());
    }


}
