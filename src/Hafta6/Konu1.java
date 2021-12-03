package Hafta6;

class Motosiklet{
    private String model;
    int guc;
    float alinanYol;

    //Kurtarma Durumu
    Motosiklet(){
        model = "Girilmedi";
        guc = -1;
        alinanYol = 0;
    }
    // temel durum
    Motosiklet(String model, int guc, float alinanYol){
        this.model = model;
        this.guc = guc;
        this.alinanYol = alinanYol;
    }

    void yolEkle(float gidilenYol){
        this.alinanYol = this.alinanYol + gidilenYol;

    }
    String getModel(){
        return this.model;
    }
    int getGuc(){
        return this.guc;
    }
    float getAlinanYol(){
        return this.alinanYol;
    }
    void setModel(String model){
        this.model = this.model + " + " + model;
    }
    void setGuc(int guc){
        this.guc = guc;
    }
    void setAlinanYol(float gidilenYol){
        this.alinanYol += gidilenYol;
    }
}


public class Konu1 {

    public static void main(String[] args) {
/*

        Motosiklet myMoto = new Motosiklet();
        if(myMoto.alinanYol <= 0){
            System.out.println("Olusturulan nesnenin gittigi yol girilmemiştir");
        }
*/
        Motosiklet musMoto = new Motosiklet("Hero", 15, 43000);
/*
        System.out.println("Mustafa'nın Motosikletinin modeli : " + musMoto.getModel() +
                "\n" + "Motorunun Gucu : " + musMoto.guc +
                "\n" + "Toplam Yaptigi Yol : " + musMoto.alinanYol);
        */
/*
        musMoto.yolEkle(125.5f);
        System.out.println("Son güncel gidilen yol : " + musMoto.alinanYol);

        */
        musMoto.setModel("Hunk");
        System.out.println("Mustafa'nın Motosikletinin modeli : " + musMoto.getModel()+
                "\n" + "Motorunun Gucu : " + musMoto.getGuc() +
                "\n" + "\"Toplam Yaptigi Yol : " + musMoto.getAlinanYol());

        musMoto.setAlinanYol(562.8f);
        System.out.println("Yeni gidilen yol : " + musMoto.getAlinanYol());
        musMoto.setGuc(30);
        System.out.println("Yeni Guc : " + musMoto.getGuc());

    }
}
