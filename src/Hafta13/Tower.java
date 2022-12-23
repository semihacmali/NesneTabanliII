package Hafta13;

public class Tower {
    int healt;
    int level;
    int damage;
    int stock;
    int attackSkill;
    int mana;
    int exp;
    boolean isDeath;

    public Tower(int healt, int level, int damage, int stock, int attackSkill, int mana, int exp) {
        this.healt = healt;
        this.level = level;
        this.damage = damage;
        this.stock = stock;
        this.attackSkill = attackSkill;
        this.mana = mana;
        this.exp = exp;
        this.isDeath = false;
    }

    public int getHealt() {
        return healt;
    }

    public void setHealt() { //her level atladiginda 100 healt arttırılacak
        this.healt = this.healt + 100;
    }
    public void takeDamage(int damage){ // hasar alindiginda healt azalacak
        this.healt = this.healt - damage;
    }

    public int getLevel() {
        return level;
    }

    public void levelUp() {
        if(this.exp >= 100){
            this.exp = this.exp - 100;//level atladiginda 100 exp harcanir
            this.level++;
            setHealt();
            setDamage();
            upStock();
            setAttackSkill();
        }
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage() { //her level atladiginda 20 damage arttırılacak
        this.damage = this.damage + 20;
    }

    public int getStock() {
        return stock;
    }

    public void downStock() {// her mermi atildiginda azaltilacak
        this.stock--;
    }
    public void upStock() {//her level atladiginda 20 mermi verilecek
        this.stock = this.stock + 20;
    }

    public int getAttackSkill() {
        return attackSkill;
    }

    public void setAttackSkill() {//surekli uzerine ekleneceği icin
        this.attackSkill = this.attackSkill + 20;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {//surekli uzerine ekleneceği icin
        this.mana = this.mana + mana;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) { //surekli uzerine ekleneceği icin
        this.exp = this.exp + exp;
    }

    public int useSkill(){
        int damage = 0;
        if(getMana() >= 60){
            this.mana = this.mana - 60;
            damage = getAttackSkill();
        }
        return damage;
    }

/*    public int takeDamage(){
        return getDamage();
    }*/

    public void isDeath(){
        if(getHealt() <= 0){
            this.isDeath =true;
        }
    }

}
