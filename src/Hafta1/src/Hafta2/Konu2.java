package Hafta2;

public class Konu2 {

    public static void main(String[] args) {

        int a = 8;
        /*
        //post-increment(sonra arttırma)
        System.out.println(a++); // a = a + 1 //8

        System.out.println(a);  //9
        */
/*

        //pre-increment(önce arttırma)
        System.out.println(++a); // a = a + 1 //9

        System.out.println(a); //9
*/

        int b = 7;
/*
        //post-decrement(sonra azaltma)
        System.out.println(b--); // b = b - 1 // 7

        System.out.println(b);//6

       */
/*

        //pre-decrement(önce azaltma)
        System.out.println(--b); // b = b - 1 // 6

        System.out.println(b);//6
*/

/*
        a = 6;
        b = 8;
        int c;
            // 6   - 7   = -1 // sonuc dogru ama yol yanlis
           // 7   -  8 = -1,  b = 7//gidis ve sonuc dogru
        c = (++a) - (b--); // -1, 0, -2, 1
        System.out.println("a = " + a); // 7
        System.out.println("b = " + b); // 7
        System.out.println("c = " + c); // -1
        */
/*

        a = 6;
        b = 8;
        boolean mantik;
                //( 6 > 7) &&   (8 < 8)
                // 0(FALSE) &&(VE) 0(False)
                // 0(False)
        mantik = (a++ > ++a) && (b < b++);
        System.out.println("(a++ > ++a) && (b < b++) = " +  mantik);

        a = 6;
        b = 8;
                //(7 >=  6)  ||  (8 > 8)
                // true      ||   false
                // true
        mantik = (++a >= a++) || (b-- > b++);
        System.out.println("(++a >= a++) || (b-- > b++) = " + mantik);
*/

        int ay = 10;

        switch (ay) {
            case 1: System.out.println("Ocak"); break;
            case 2: System.out.println("Şubat"); break;
            case 3: System.out.println("Mart"); break;
            case 4: System.out.println("Nisan"); break;
            case 5: System.out.println("Mayıs"); break;
            case 6: System.out.println("Haziran"); break;
            case 7: System.out.println("Temmuz"); break;
            case 8: System.out.println("Ağustos"); break;
            case 9: System.out.println("Eylül"); break;
            case 10: System.out.println("Ekim"); break;
            case 11: System.out.println("Kasım"); break;
            case 12: System.out.println("Aralık"); break;
            default: System.out.println("Ay 1 - 12 aralığında değil");
        }


    }
}
