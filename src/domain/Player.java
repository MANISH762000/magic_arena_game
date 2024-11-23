package domain;

public class Player {
    private final String name;
    private final int health;
    private final int strength;
    private final int attack;

    public Player(String name, int health, int strength, int attack) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

}
