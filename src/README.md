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
3. Run the compiled code:
   ```bash
   java Main
   

## Demo flow of Arena

- Enter player A name:
- manish
- Enter player A health:50
- Enter player A strength:5
- Enter player A attack:10
- Enter player B name:
- tanvi
- Enter player B health:100
- Enter player B strength:10
- Enter player B attack:5
- Match started between manish and tanvi
- manish will now attacks tanvi with 20 damage
- tanvi will now defends with 60 damage
- manish attacks tanvi with 20 damage
- tanvi defends with 60 damage! Remaining Health:100
- tanvi will now attacks manish with 20 damage
- manish will now defends with 25 damage
- tanvi attacks manish with 20 damage
- manish defends with 25 damage! Remaining Health:50
- manish will now attacks tanvi with 40 damage
- tanvi will now defends with 20 damage
- manish attacks tanvi with 40 damage
- tanvi defends with 20 damage! Remaining Health:80
- tanvi will now attacks manish with 5 damage
- manish will now defends with 25 damage
- tanvi attacks manish with 5 damage
- manish defends with 25 damage! Remaining Health:50
- manish will now attacks tanvi with 10 damage
- tanvi will now defends with 30 damage
- manish attacks tanvi with 10 damage
- tanvi defends with 30 damage! Remaining Health:80
- tanvi will now attacks manish with 30 damage
- manish will now defends with 10 damage
- tanvi attacks manish with 30 damage
- manish defends with 10 damage! Remaining Health:30
- manish will now attacks tanvi with 60 damage
- tanvi will now defends with 60 damage
- manish attacks tanvi with 60 damage
- tanvi defends with 60 damage! Remaining Health:80
- tanvi will now attacks manish with 10 damage
- manish will now defends with 30 damage
- tanvi attacks manish with 10 damage
- manish defends with 30 damage! Remaining Health:30
- manish will now attacks tanvi with 30 damage
- tanvi will now defends with 20 damage
- manish attacks tanvi with 30 damage
- tanvi defends with 20 damage! Remaining Health:70
- tanvi will now attacks manish with 10 damage
- manish will now defends with 20 damage
- tanvi attacks manish with 10 damage
- manish defends with 20 damage! Remaining Health:30
- manish will now attacks tanvi with 50 damage
- tanvi will now defends with 30 damage
- manish attacks tanvi with 50 damage
- tanvi defends with 30 damage! Remaining Health:50
- tanvi will now attacks manish with 10 damage
- manish will now defends with 5 damage
- tanvi attacks manish with 10 damage
- manish defends with 5 damage! Remaining Health:25
- manish will now attacks tanvi with 10 damage
- tanvi will now defends with 40 damage
- manish attacks tanvi with 10 damage
- tanvi defends with 40 damage! Remaining Health:50
- tanvi will now attacks manish with 10 damage
- manish will now defends with 5 damage
- tanvi attacks manish with 10 damage
- manish defends with 5 damage! Remaining Health:20
- manish will now attacks tanvi with 20 damage
- tanvi will now defends with 40 damage
- manish attacks tanvi with 20 damage
- tanvi defends with 40 damage! Remaining Health:50
- tanvi will now attacks manish with 10 damage
- manish will now defends with 5 damage
- tanvi attacks manish with 10 damage
- manish defends with 5 damage! Remaining Health:15
- manish will now attacks tanvi with 50 damage
- tanvi will now defends with 60 damage
- manish attacks tanvi with 50 damage
- tanvi defends with 60 damage! Remaining Health:50
- tanvi will now attacks manish with 30 damage
- manish will now defends with 30 damage
- tanvi attacks manish with 30 damage
- manish defends with 30 damage! Remaining Health:15
- manish will now attacks tanvi with 40 damage
- tanvi will now defends with 30 damage
- manish attacks tanvi with 40 damage
- tanvi defends with 30 damage! Remaining Health:40
- tanvi will now attacks manish with 25 damage
- manish will now defends with 10 damage
- tanvi attacks manish with 25 damage
- manish defends with 10 damage! Remaining Health:0
- tanvi wins!