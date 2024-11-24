package test;

import domain.Player;
import org.junit.jupiter.api.Test;
import presentation.GameUI;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.*;

public class GameUITest {

    @Test
    public void testGetPlayerInput() {
        String input = "TestPlayer\n100\n10\n15\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        GameUI gameUI = new GameUI();
        Player player = gameUI.getplayerInput("TestPlayer");

        assertEquals("TestPlayer", player.getName());
        assertEquals(100, player.getHealth());
        assertEquals(10, player.getStrength());
        assertEquals(15, player.getAttack());
    }
}