package Army.soldier;

import Army.command.Defending;

public class Spearman extends Soldier implements Defending {

    private final int damageDef = 4;
    private final int damageDefHigh = 4;


    public Spearman(String name) {
        super(name);

    }

    public int getDamageDef() {
        return damageDef;
    }

    public int getDamageDefHigh() {
        return damageDefHigh;
    }

    public void printInfo() {
        System.out.println("Soldier " + super.getName() + " here. Type - DEFENSIVE");

    }

    @Override
    public void printDefend() {
        System.out.println("Spearman " + super.getName() + " deals " + this.getDamageDef() + " damages.");
    }

    @Override
    public void printFireDefend() {
        System.out.println("Spearman " + super.getName() + " deals " + this.getDamageDefHigh() + " damages.");
    }
}

