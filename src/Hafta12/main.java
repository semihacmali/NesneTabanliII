package Hafta12;

public class main {
    public static void main(String[] args) {

/*        Tasit t1 = new Tasit(16,"Otomatik");
        int t1Ilerme = t1.ilerleme(3);
        t1.info();
        System.out.println("Tasit " + t1Ilerme + "  KM kadar ilerlemistir.");
        */

/*        DenizTasiti d1 = new DenizTasiti("Nukleer", 30,
                "Bilmiyorum", "Askeri", 50);
        int d1Ilerleme = d1.ilerleme(5);
        d1.info();
        */

/*        KaraTasiti k1 = new KaraTasiti(50, "Manuel", 4, true);
        k1.info();
        k1.setDireksiyonKonumu("Sağ");
        k1.info();
        System.out.println("Direksiyon boolean : " + k1.direksiyonKonumu);
        */

        MotorluKaraTasiti m1 = new MotorluKaraTasiti("Benzin", 60, "Manuel", 4, false,
                "4x4", 2500, 12000,"Stajen", 2020);

        m1.info();
        int m1Ilerleme = m1.ilerleme(30);
        m1.setKM(m1Ilerleme);
        m1.info();

    }
}
