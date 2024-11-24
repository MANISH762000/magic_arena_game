# Magical Arena

This project implements a simple simulation of a magical arena where two players can fight until one player's health reaches zero. The players take turns attacking each other, and the damage dealt is calculated based on their attributes and dice rolls.

## Problem Statement

Each player is defined by three attributes:
- *Health*: The player's health points.
- *Strength*: The player's ability to defend against damage.
- *Attack*: The player's ability to deal damage.

Players attack in turns, rolling a six-sided die to determine the damage dealt and defended.

## Classes

- *Player*: Represents a player in the arena with attributes for health, strength, and attack.
- *Arena*: Manages the match between two players and handles the turn-based combat logic.
- *Main*: The entry point of the application that initializes players and starts the match.

# Magical Arena

This project implements a simple simulation of a magical arena where two players can fight until one player's health reaches zero. The players take turns attacking each other, and the damage dealt is calculated based on their attributes and dice rolls.

## Problem Statement

Each player is defined by three attributes:
- *Health*: The player's health points.
- *Strength*: The player's ability to defend against damage.
- *Attack*: The player's ability to deal damage.

Players attack in turns, rolling a six-sided die to determine the damage dealt and defended.

## Classes

- *Player*: Represents a player in the arena with attributes for health, strength, and attack.
- *Arena*: Manages the match between two players and handles the turn-based combat logic.
- *Main*: The entry point of the application that initializes players and starts the match.

## How to Run the Code

1. Ensure you have Java Development Kit (JDK) installed on your machine.
2. Compile the Java files:
   ```bash
   javac Main.java Player.java Arena.java
## How to Run the Code

1. Ensure you have Java Development Kit (JDK) installed on your machine.
2. Compile the Java files:
   ```bash
   javac Main.java Player.java Arena.java
3. Run the compiled code:
   ```bash
   java Main