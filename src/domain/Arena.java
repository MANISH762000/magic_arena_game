package domain;

public class Arena {
    private Player playerA;
    private Player playerB;

    public Arena(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    public void startMatch() {
        Player attacker = playerA.getHealth()<playerB.getHealth()?playerA:playerB;
        Player defender = attacker == playerA?playerB:playerA;

        while(playerA.isAlive() && playerB.isAlive()) {
            int attackDamage = attacker.attackDamage();
            int defendDamage = defender.defendDamage();
            System.out.println(attacker.getName() + " will now attacks " + defender.getName() + " with " + attackDamage + " damage");
            System.out.println(defender.getName() + " will now defends with " + defendDamage + " damage");

            int damageToDefender = Math.max(0, attackDamage - defendDamage);
            defender.takeDamage(damageToDefender);

            System.out.printf("%s attacks %s with %d damage\n", attacker.getName(), defender.getName(), attackDamage);
            System.out.printf("%s defends with %d damage! Remaining Health:%d\n", defender.getName(), defendDamage,defender.getHealth());

            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }
        if(attacker.isAlive()) {
            System.out.printf("%s wins!\n", attacker.getName());
        } else {
            System.out.printf("%s wins!\n", defender.getName());
        }
    }
}
