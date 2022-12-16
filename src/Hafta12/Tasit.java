package Hafta12;

public class Tasit {
    private String yakitTuru; // private -> sadece kendi classından erisilebilir
    protected int hiz;// protected -> sadece kendi classı ve alt classlardan erisilebilir
    public String vitesTuru; // public -> halkin mali olur

    public Tasit() {
        hiz = 0;
        yakitTuru = "Girilmedi";
        vitesTuru = "Girilmedi";
    }

    protected Tasit(String yakitTuru, int hiz, String vitesTuru) {
        this(hiz, vitesTuru);
        this.yakitTuru = yakitTuru;
    }

    public Tasit(int hiz, String vitesTuru) {
        this.hiz = hiz;
        this.vitesTuru = vitesTuru;
    }

    public String getYakitTuru() {
        return yakitTuru;
    }

    protected void setYakitTuru(String yakitTuru) {
        this.yakitTuru = yakitTuru;
    }

    public int getHiz() {
        return hiz;
    }

    public void setHiz(int hiz) {
        this.hiz = hiz;
    }

    public String getVitesTuru() {
        return vitesTuru;
    }

    public void setVitesTuru(String vitesTuru) {
        this.vitesTuru = vitesTuru;
    }

    public int ilerleme(int zaman){ // zaman -> saat cinsinden tam sayi olmalidir
        return (this.hiz * zaman);
    }

    public void info(){
        System.out.println("Uretilen Tasitin Hizi : " + this.hiz +
                "\nYakit Turu : " + this.yakitTuru +
                "\nVites Turu : " + this.vitesTuru);
    }
}
