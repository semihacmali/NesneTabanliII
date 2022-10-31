package Hafta3;

public class SelectionSort {

    public static int[] kabarcıkAlgoritmasi(int[] intDizi) {
        int n = intDizi.length;
        int temp = 0;

        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){

                if(intDizi[j-1] < intDizi[j]){
                    temp = intDizi[j-1];
                    intDizi[j-1] = intDizi[j];
                    intDizi[j] = temp;
                }

            }
            for(int k = 0; k < intDizi.length;k++)
                System.out.print(intDizi[k]+ "\t");
            System.out.println();
        }
        return intDizi;
    }
    private static void kabarcıkAlgoritmasıTersten(int[] intTersdizi) {
        int n = intTersdizi.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (intTersdizi[j - 1] < intTersdizi[j]) {
                    temp = intTersdizi[j - 1];
                    intTersdizi[j - 1] = intTersdizi[j];
                    intTersdizi[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] dizi = {89, 45, 15356, 25485, 23, 8};

        dizi = kabarcıkAlgoritmasi(dizi);
        for(int sayi:dizi){
            //Boolean ile (":") birbirine çevililebilen ifadeler  yada aynı tip ifadeler olduğu için bu for döngümüzdede gelen sayı dizideki sayılarımızla true olana kadar devam eder.
            // false ise dizilerimizdeki sayıyla aynı değilse atlar true ise ekrana yazdırır.
            System.out.print(sayi + "\t");}

    }
}
