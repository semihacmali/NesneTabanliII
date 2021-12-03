package Hafta6;

class Cat{
    // ismi dışardan erişilemeyecek
    // yaş
    // cins dışardan erişilemeyecek
    // mama durumu kap cinsinden

    private String isim;
    int yas;
    private String cins;
    int mamaDurumu;

    public Cat(String isim, int yas, String cins, int mamaDurumu) {
        this.isim = isim;
        this.yas = yas;
        this.cins = cins;
        this.mamaDurumu = mamaDurumu;
    }

    public Cat() {
        this.isim = "Girilmedi";
        this.yas = 0;
        this.cins = "Girilmedi";
        this.mamaDurumu = 0;
    }
    // set ve get
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getCins() {
        return cins;
    }

    public void setCins(String cins) {
        this.cins = cins;
    }

    public int getMamaDurumu() {
        return mamaDurumu;
    }

    public void setMamaDurumu(int mamaDurumu) {
        if(this.mamaDurumu <= 0){
            this.mamaDurumu = 0;
        }
        this.mamaDurumu += mamaDurumu;
    }
    // günde 2 kap veriliyor
    public void birSonrakiGun(){
        this.mamaDurumu -= 2;
        if(this.mamaDurumu <= 0){
            System.out.println("Mama Bitti");
        }
    }



}

public class Soru1 {

    public static void main(String[] args) {

        Cat myCat = new Cat("Perez", 1, "Tekir", 3);

        myCat.birSonrakiGun();
        myCat.birSonrakiGun();
        myCat.setMamaDurumu(200);

        System.out.println("Suan ki mama Durumu : " + myCat.getMamaDurumu());

        System.out.println("Kedimin İsmi : " + myCat.getIsim() +
                "\nKedimin Yasi : " + myCat.getYas() +
                "\nKedimin Cinsi : " + myCat.getCins()+
                "\nKedimin Mama Durumu : " + myCat.getMamaDurumu());


    }
}
