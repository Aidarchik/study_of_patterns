package composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MilitaryTest {
    @Test
    void shouldCalculateTotalSquadCost() {

        MilitaryComponent soldier1 = new Soldier(100);
        MilitaryComponent soldier2 = new Soldier(150);

        Platoon platoon = new Platoon();

        platoon.add(soldier1);
        platoon.add(soldier2);

        assertEquals(250, platoon.getCost());

        int cost = platoon.getCost();
        System.out.println(cost);
    }
}
