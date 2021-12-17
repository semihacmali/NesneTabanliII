package Hafta8;

public class Konu1 {

    public static void main(String[] args) {

        Araba linea = new Araba("Fiat Linea", "Önden çekişli", 1, 5,
                1.3f,95, 140000);
        linea.info();

/*

        System.out.println(linea.kategoriAd + "\t" + linea.aciklama);
        System.out.println(linea.adet);
*/

        Araba civic = new Araba("Honda Civic", "Önden Çekişli", 2, 150000);
        System.out.println(civic.adet);

    }

}
