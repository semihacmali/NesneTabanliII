package Hafta7;
//Filmler
// filmlerin genel özellikleri
    // Yönetmen, yapım şirketi
//Filmlerin alt kategorileri
    //Sci-Fi, Action
//Sci-Fi özellikleri
    //ileri teknoloji, fantastik, olağandışı
//Action özellikleri
    //patlama, gerilim, macera
//2 tane bu film türlerinden birini seçip sınıf oluşturun
class Filmler{
    String yonetmen, yapimsirketi;

    public String getYonetmen() {
        return yonetmen;
    }

    public void setYonetmen(String yonetmen) {
        this.yonetmen = yonetmen;
    }

    public String getYapimsirketi() {
        return yapimsirketi;
    }

    public void setYapimsirketi(String yapimsirketi) {
        this.yapimsirketi = yapimsirketi;
    }
}

class SciFi extends Filmler{
    void teknoloji(){
        System.out.println("İleri Teknoloji kullanilir.");
    }
    void tur(){
        System.out.println("Fantastik ogeler barindirir.");
    }
    void icerik(){
        System.out.println("Olagandisi ogeler icerir.");
    }
}

class Action extends Filmler{
    void icerik(){
        System.out.println("Patlama sahneleri vardir.");
    }
    void tur(){
        System.out.println("Gerilim ve macera turundedir.");
    }
}


public class Soru1 {
    public static void main(String[] args) {

        SciFi dune = new SciFi();
        System.out.println("Dune Filminin Ozellikleri");
        dune.setYonetmen("Denis Villeneuve");
        dune.setYapimsirketi("Legendary Pictures");
        System.out.println("Yonetmeni : " + dune.getYonetmen() +
                "\nYapım Şirketi : " + dune.getYapimsirketi());
        dune.icerik();
        dune.teknoloji();
        dune.tur();

        Action deathRace = new Action();
        System.out.println("Death Race Filminin Ozellikleri");
        deathRace.setYonetmen("Paul W. S. Anderson");
        deathRace.setYapimsirketi("Jason Statham");
        System.out.println("Yonetmeni : " + deathRace.getYonetmen() +
                "\nYapım Şirketi : " + deathRace.getYapimsirketi());
        deathRace.icerik();
        deathRace.tur();

    }
}
