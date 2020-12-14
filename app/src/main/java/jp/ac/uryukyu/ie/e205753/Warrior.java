package jp.ac.uryukyu.ie.e205753;

public class Warrior extends Hero {
    public Warrior(String name, int hitPoint, int attack){
        super(name, hitPoint, attack);
    }

    public void attackWithWeponSkill(LivingThing opponent){
        if( dead == false ){
            double damage = (1.5 * attack);
            int _damage = (int)damage;
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", name, opponent.getName(), _damage);
            opponent.wounded(_damage);
        }
    }
    
}
