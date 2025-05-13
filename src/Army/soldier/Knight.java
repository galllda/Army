package Army.soldier;

import Army.command.Attacking;
import Army.command.Flanking;

public class Knight extends Soldier implements Attacking, Flanking {

    private final int damage = 5;
    private final int damageHigh = 5;


    public Knight(String name) {
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
        System.out.println("Knight " + super.getName() + " deals " + this.getDamage() + " damages.");
    }

    @Override
    public void printFuryAttack() {
        System.out.println("Knight " + super.getName() + " deals " + this.getDamageHigh() + " damages.");
    }

    @Override
    public void printFlanking() {
        System.out.println("Knight " + super.getName() + " is flanking.");
    }
}
