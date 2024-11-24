package test;

import application.ArenaService;
import domain.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArenaServiceTest {

    @Test
    public void testStartMatch() {
        Player playerA = new Player("PlayerA", 100, 10, 15);
        Player playerB = new Player("PlayerB", 100, 10, 15);
        ArenaService arenaService = new ArenaService(playerA, playerB);
        arenaService.startMatch();
        assertTrue(playerA.isAlive() || playerB.isAlive());
    }
}