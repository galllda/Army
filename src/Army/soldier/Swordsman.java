package Army.soldier;

import Army.command.Attacking;
import Army.command.Defending;

public class Swordsman extends Soldier implements Attacking, Defending {

    private final int damage = 3;
    private final int damageHigh = 3;
    private final int damageDef = 3;
    private final int damageDefHigh = 5;

    public Swordsman(String name) {
        super(name);
    }

    public int getDamage() {
        return damage;
    }

    public int getDamageHigh() {
        return damageHigh;
    }

    public int getDamageDef() {
        return damageDef;
    }

    public int getDamageDefHigh() {
        return damageDefHigh;
    }

    @Override
    public void printAttack() {
        System.out.println("Swordsman" + " " + super.getName() + " deals " + this.getDamage() + " damages.");
    }

    public void printInfo() {
        System.out.println("Soldier " + super.getName() + " here. Type - ADAPTABLE");

    }

    @Override
    public void printFuryAttack() {
        System.out.println("Swordsman " + super.getName() + " deals " + this.getDamageHigh() + " damages.");
    }


    @Override
    public void printDefend() {
        System.out.println("Swordsman " + super.getName() + " deals " + this.getDamageDef() + " damages.");
    }

    @Override
    public void printFireDefend() {
        System.out.println("Swordsman " + super.getName() + " deals " + this.getDamageDefHigh() + " damages.");

    }
}
