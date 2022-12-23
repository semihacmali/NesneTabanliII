package Hafta13;

public class Minyon {
    int healt;
    int damage;
    int exp;
    boolean death;

    public Minyon(int healt, int damage) {
        this.healt = healt;
        this.damage = damage;
        this.exp = 10;
        this.death = false;
    }

    public int getHealt() {
        return healt;
    }

    public void takeDamage(int damage) {
        this.healt = this.healt - damage;
    }

    public int getDamage() {
        return damage;
    }

    public int getExp() {
        return exp;
    }

    public void setDeath(boolean death) {
        this.death = death;
    }
    public boolean getDeath() {
        return this.death;
    }

    public int isDeath(){
        int getExp = 0;
        if(this.healt <= 0){
           this.death = true;
           getExp = getExp();
        }
        return getExp;
    }


}
