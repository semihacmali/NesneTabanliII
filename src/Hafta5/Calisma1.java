package Hafta5;

public class Calisma1 {

    public static void main(String[] args) {
        Dortgen kare = new Dortgen(4);
        System.out.println("Karenin Alani : " + kare.Alan());

        Dortgen dikdortgen = new Dortgen(4, 3);
        System.out.println("Dikdortgenin Alani : " + dikdortgen.Alan());

        Dortgen bos = new Dortgen();
        System.out.println("Bos Alani : " + bos.Alan());
    }

    static class Dortgen{
        int a;
        int b;

        Dortgen(int a, int b){
            this.a = a;
            this.b = b;
        }
        Dortgen(int a){
            this.a = a;
            this.b = a;
        }
        Dortgen(){
            this.a = 0;
            this.b = 0;
        }
        public int Alan(){
            int sonuc = a * b;
            return sonuc;
        }

    }
}
