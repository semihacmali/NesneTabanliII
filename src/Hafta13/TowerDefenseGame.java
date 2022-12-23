package Hafta13;

import java.util.Scanner;

public class TowerDefenseGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tower t1 = new Tower(100, 1, 20, 10, 40, 0, 0);
        Minyon[] minyonlar = new Minyon[4];
        Goblin[] goblinler = new Goblin[2];
        for(int i = 0; i < 4 ; i++){
            Minyon m1 = new Minyon(30, 5);
            minyonlar[i] = m1;
        }
        for(int i = 0; i < 2; i++){
            Goblin g1 = new Goblin(40, 10);
            goblinler[i] = g1;
        }
        // 1 - 10 arasında rasgele sayi uretelim
        //sayi 1-5 arasında gelirse tower vursun
        //6-7 gelirse goblin vursun
        // 8-10 arasında gelirse goblin vursun
        boolean conti = true;
        while (conti){
            int randomNum = 0 + (int)(Math.random() * 10);
            if(randomNum < 5){
                System.out.println("Tower hasar verecek!!!");
                int towerDamage = t1.getDamage();
                int randomNum1 = 0 + (int)(Math.random() * 2);
                if(randomNum1 < 1){
                    for(int i = 0; i < minyonlar.length; i++){
                        if(!minyonlar[i].getDeath()){
                            t1.downStock();
                            minyonlar[i].takeDamage(towerDamage);
                            System.out.println(i + ". minyon hasar aldı.");
                            if(minyonlar[i].isDeath() > 0){
                                System.out.println(i + ". minyon öldü.");
                                t1.setExp(minyonlar[i].getExp());
                            }
                        }

                    }
                }else{
                    for(int i = 0; i < goblinler.length; i++){
                        if(!goblinler[i].getDeath()){
                            t1.downStock();
                            goblinler[i].takeDamage(towerDamage);
                            System.out.println(i + ". goblin hasar aldı.");
                            if(goblinler[i].isDeath() > 0){
                                System.out.println(i + ". goblin öldü.");
                                t1.setExp(goblinler[i].getExp());
                            }
                        }
                    }
                }
            }

            else if(randomNum < 7){
                for(int i = 0; i < minyonlar.length; i++){
                    if(!minyonlar[i].getDeath()){
                        System.out.println("Tower" + i + ". minyondan hasar aldı.");
                        t1.takeDamage(minyonlar[i].getDamage());
                        t1.isDeath();
                        if(t1.getHealt() <= 0){
                            System.out.println("Tower öldü oyun bitti");
                        }
                    }
                }
            }
            else{
                for(int i = 0; i < goblinler.length; i++){
                    if(!goblinler[i].getDeath()){
                        System.out.println("Tower" + i + ". goblinden hasar aldı.");
                        t1.takeDamage(goblinler[i].getDamage());
                        t1.isDeath();
                        if(t1.getHealt() <= 0){
                            System.out.println("Tower öldü oyun bitti");
                        }
                    }
                }
            }
            System.out.println("Devam mı?");
            int devam = scanner.nextInt();
            if(devam == 0){
                conti = false;
            }

        }




    }
}
