import domain.Player;
import domain.Arena;
import presentation.GameUI;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GameUI gameUI = new GameUI();
        Player player1 = gameUI.getplayerInput("A");
        Player player2 = gameUI.getplayerInput("B");
        Arena arena = new Arena(player1, player2);
        arena.startMatch();

    }
}