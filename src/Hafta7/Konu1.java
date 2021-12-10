package Hafta7;
//Hayvanların en genel özellikleri
  // Solunum, eşeyli üreme
// hayvanlar alt sınıf olarak;
   // Kuslar, sürüngen
//Kusların genel özellikleri
  //uçabilirler, taşlıkları vardır
// sürüngenlerin genel özellikleri
    // mideleri vardır, soğuk kanlıdırlar
//Kuslarin alt sınıfları;
    //kanarya, akbaba
//Kanarya özellikleri
    // boyutu 5 ile 10 cm arasında
//Akbaba özellikleri
    // boyutu 1 ile 4 metre arasında

class Hayvanlar{
    String adi;

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    void solunum(){
        System.out.println("Solunum Yapar.");
    }
    void üreme(){
        System.out.println("Eşeyli Olarak Ürerler.");
    }
}

class Kuslar extends Hayvanlar{

    void sindirim(){
        System.out.println("Kuşlar taşlıkları sayesinde sindirim yaparlar.");
    }
    void ucmak(){
        System.out.println("Kuslar ucabilir.");
    }

}
class Surungenler extends Hayvanlar{
    void sindirim(){
        System.out.println("Sürüngenler mideleri sayesinde sindirim yapar.");
    }
    void vucudSicakligi(){
        System.out.println("Sürüngenler soğuk kanlidir.");
    }
}

class Kanarya extends Kuslar{
    void boyut(){
        System.out.println("Kanaryaların Boyu 5 ile 10 cm arasindadir.");
    }
}

class Akbaba extends Kuslar{
    void boyut(){
        System.out.println("Akbabaların Boyu 1 ile 4 metre arasindadir.");
    }
}

public class Konu1 {
    public static void main(String[] args) {
/*      // Hayvanlar sınıfını tarafından üretilen alt sınıflar
        Kuslar güvercin = new Kuslar();
        System.out.println("Kuşlar Sınıfının Özellikleri :");
        güvercin.solunum();
        güvercin.setAdi("Güvercin");
        güvercin.sindirim();
        güvercin.ucmak();


        Surungenler kertenkele = new Surungenler();
        System.out.println("Sürüngenler Sınıfının Özellikleri :");
        kertenkele.solunum();
        kertenkele.setAdi("Kertenkele");
        kertenkele.sindirim();
        kertenkele.vucudSicakligi();

*/

        // Kuslar sinifindan uretilen alt siniflar
        Kanarya kanarya = new Kanarya();
        System.out.println("Kanaryanin Ozellikleri : ");
        kanarya.boyut();
        kanarya.sindirim();

        Akbaba akbaba = new Akbaba();
        System.out.println("Akbabanin Ozellikleri : ");
        akbaba.boyut();
        akbaba.sindirim();
    }
}
