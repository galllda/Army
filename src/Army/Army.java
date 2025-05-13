package Army;

import Army.command.Attacking;
import Army.command.Defending;
import Army.command.Flanking;
import Army.soldier.Soldier;

import java.util.ArrayList;
import java.util.List;

public class Army {

    private List<Soldier> soldiers;
    private String name;


    public Army(String name) {
        this.soldiers = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addSoldier(Soldier soldier) {
        this.soldiers.add(soldier);
    }

    public void killSoldier(Army army, Soldier soldier, Soldier soldier2) {
        System.out.println("\n-------FIGHTING--------");
        System.out.println(soldier.getName() + " (" + this.name + ") was killed by " + soldier2.getName() + " (" + army.getName() + ")!");
        this.soldiers.remove(soldier);
    }

    public void printSoldiers() {
        System.out.println("\n-------REPORT (" + this.name + " army)--------");
        for (Soldier soldier : this.soldiers) {
            soldier.printInfo();
        }
    }

    public void printAttack() {
        System.out.println("\n-------ATTACK--------");
        for (Soldier soldier : this.soldiers) {
            if (soldier instanceof Attacking) {
                ((Attacking) soldier).printAttack();
            }
        }
    }

    public void printDefend() {
        System.out.println("\n-------DEFEND--------");
        for (Soldier soldier : this.soldiers) {
            if (soldier instanceof Defending) {
                ((Defending) soldier).printDefend();
            }
        }
    }

    public void printFuryAttack() {
        System.out.println("\n-------FURY ATTACK--------");
        for (Soldier soldier : this.soldiers) {
            if (soldier instanceof Attacking) {
                ((Attacking) soldier).printFuryAttack();
            }
        }
    }

    public void printFireDefend() {
        System.out.println("\n-------FIRE DEFEND--------");
        for (Soldier soldier : this.soldiers) {
            if (soldier instanceof Defending) {
                ((Defending) soldier).printFireDefend();
            }
        }
    }

    public void printFlanking() {
        System.out.println("\n-------FLANK--------");
        for (Soldier soldier : this.soldiers) {
            if (soldier instanceof Flanking) {
                ((Flanking) soldier).printFlanking();
            }
        }
    }
}
