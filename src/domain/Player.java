package domain;

import java.util.Random;

public class Player {
    private final String name;
    private int health;
    private int strength;
    private int attack;

    public Player(String name, int health, int strength, int attack) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }
    public int getHealth() {
        return health;
    }
    public int getStrength() {
        return strength;
    }
    public int getAttack() {
        return attack;
    }
    public String getName() {
        return name;
    }
    public void takeDamage(int damage) {
        this.health -= damage;
    }
    public boolean isAlive() {
        return health > 0;
    }
    public int rollDice() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
    public int attackDamage() {
        return rollDice() * attack;
    }

    public int defendDamage() {
        return rollDice() * strength;
    }

}
