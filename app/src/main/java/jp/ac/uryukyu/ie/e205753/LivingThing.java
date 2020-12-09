package jp.ac.uryukyu.ie.e205753;

public class LivingThing {
    String name;
    int hitPoint;
    int attack;
    boolean dead;

    LivingThing(String name, int hitPoint, int attack){
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        dead = false;
    }

    public boolean isDead(){
        return dead;
    };

    public String getName(){
        return name;
    }

    public void attack(LivingThing opponent){
        if( dead == false ){
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    public void wounded(int damage){
        hitPoint -= damage;
        if(hitPoint <= 0){
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }

    
}
