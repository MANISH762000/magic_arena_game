package presentation;

import domain.Player;

import java.util.Scanner;

public class GameUI {
    private final Scanner scanner ;

    public GameUI() {
        scanner = new Scanner(System.in);
    }
    public Player getplayerInput(String playerName) {
        System.out.println("Enter player " + playerName + " name:");
        String name = scanner.nextLine();
        System.out.printf("Enter player %s health:", playerName);
        int health = scanner.nextInt();
        System.out.printf("Enter player %s strength:", playerName);
        int strength = scanner.nextInt();
        System.out.printf("Enter player %s attack:", playerName);
        int attack  = scanner.nextInt();

        return new Player(name, health, strength, attack);
    }
}
