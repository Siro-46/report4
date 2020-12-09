package jp.ac.uryukyu.ie.e205753;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    @Test 
    void warriorTest() {
        int resurtEnemyHp = 0;
        Warrior warrior = new Warrior("デモ", 100, 10);
        Enemy hp45 = new Enemy("デモ敵", 45, 1);
        for (int i = 0; i < 3; i++){
            warrior.attackWithWeponSkill(hp45);
        }
        assertEquals(resurtEnemyHp, hp45.getHitPoint());

    }
}
