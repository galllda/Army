package Army.soldier;

import Army.command.Attacking;

public class Berserk extends Soldier implements Attacking {

    private final int damage = 3;
    private final int damageHigh = 6;

    public Berserk(String name) {
        super(name);
    }

    public int getDamage() {
        return damage;
    }

    public int getDamageHigh() {
        return damageHigh;
    }

    public void printInfo() {
        System.out.println("Soldier " + super.getName() + " here. Type - OFFENSIVE");

    }

    @Override
    public void printAttack() {
        System.out.println("Berserk +" + super.getName() + " deals " + this.getDamage() + " damages.");
    }

    @Override
    public void printFuryAttack() {
        System.out.println("Berserk+" + super.getName() + " deals " + this.getDamageHigh() + " damages.");
    }

}
