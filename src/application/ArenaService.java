package application;

import domain.Arena;
import domain.Player;

public class ArenaService {
    private Player playerA;
    private Player playerB;

    public ArenaService(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }
    public void startMatch() {
        System.out.println("Match started between " + playerA.getName() + " and " + playerB.getName());
        Arena arena = new Arena(playerA, playerB);
        arena.startMatch();
    }
}
