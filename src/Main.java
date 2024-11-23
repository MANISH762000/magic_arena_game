import application.ArenaService;
import domain.Player;
import domain.Arena;
import presentation.GameUI;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GameUI gameUI = new GameUI();
        Player playerA = gameUI.getplayerInput("A");
        Player playerB = gameUI.getplayerInput("B");
        ArenaService arenaService = new ArenaService(playerA, playerB);
        arenaService.startMatch();

    }
}