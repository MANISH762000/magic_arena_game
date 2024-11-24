import domain.Arena;
import domain.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArenaTest {

    @Test
    public void testArenaInitialization() {
        Player playerA = new Player("PlayerA", 100, 10, 15);
        Player playerB = new Player("PlayerB", 100, 10, 15);
        Arena arena = new Arena(playerA, playerB);
        assertNotNull(arena);
    }

    @Test
    public void testStartMatch() {
        Player playerA = new Player("PlayerA", 100, 10, 15);
        Player playerB = new Player("PlayerB", 100, 10, 15);
        Arena arena = new Arena(playerA, playerB);
        arena.startMatch();
        assertTrue(playerA.isAlive() || playerB.isAlive());
    }
}