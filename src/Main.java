import domain.Player;
import domain.Arena;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Player player = new Player("Tim", 10, 15);
        Player player2 = new Player("Tim", 10, 15);
        Arena arena = new Arena(player, player2);
        arena.startMatch();

    }
}