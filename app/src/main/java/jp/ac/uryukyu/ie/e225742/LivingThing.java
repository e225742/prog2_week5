package jp.ac.uryukyu.ie.e225742;

public class LivingThing {
    String name;
    int hitPoint;
    int attack;
    boolean dead;

    public String getName(){
        return this.name;
    }
    public int getHitpoint(){
        return this.hitPoint;
    }
    public boolean isDead(){
        return this.dead;
    }


    public void attack(LivingThing oponent){
        if (this.dead == false){
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, oponent.getName(), damage);
            oponent.wounded(damage);
        }
    }

    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}
