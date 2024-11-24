package test;

import domain.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {
    @Test
    public void testPlayerAttributes() {
        Player player = new Player("TestPlayer", 100, 10, 15);
        assertEquals("TestPlayer", player.getName());
        assertEquals(100, player.getHealth());
        assertEquals(10, player.getStrength());
        assertEquals(15, player.getAttack());
    }

    @Test
    public void testTakeDamage() {
        Player player = new Player("TestPlayer", 100, 10, 15);
        player.takeDamage(20);
        assertEquals(80, player.getHealth());
    }

    @Test
    public void testIsAlive() {
        Player player = new Player("TestPlayer", 100, 10, 15);
        assertTrue(player.isAlive());
        player.takeDamage(100);
        assertFalse(player.isAlive());
    }

    @Test
    public void testAttackDamage() {
        Player player = new Player("TestPlayer", 100, 10, 15);
        int damage = player.attackDamage();
        assertTrue(damage >= 15 && damage <= 90); // 1*15 to 6*15
    }

    @Test
    public void testDefendDamage() {
        Player player = new Player("TestPlayer", 100, 10, 15);
        int damage = player.defendDamage();
        assertTrue(damage >= 10 && damage <= 60); // 1*10 to 6*10
    }
}