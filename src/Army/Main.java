package Army;

import Army.soldier.*;

public class Main {
    public static void main(String[] args) {

        Army army1 = new Army("Mongolian");
        Swordsman swordsman1 = new Swordsman("Swordsman 1");
        Swordsman swordsman2 = new Swordsman("Swordsman 2");

        army1.addSoldier(swordsman1);
        army1.addSoldier(swordsman2);

        Archer archer1 = new Archer("Archer 1");
        Archer archer2 = new Archer("Archer 2");
        Archer archer3 = new Archer("Archer 3");

        Spearman spearman1 = new Spearman("Spearman 1");
        Spearman spearman2 = new Spearman("Spearman 2");

        Berserk berserk1 = new Berserk("Berserk 1");

        army1.addSoldier(archer1);
        army1.addSoldier(archer2);
        army1.addSoldier(archer3);
        army1.addSoldier(spearman1);
        army1.addSoldier(spearman2);
        army1.addSoldier(berserk1);


        Knight knight1 = new Knight("Knight 1");
        Knight knight2 = new Knight("Knight 2");
        Knight knight3 = new Knight("Knight 3");

        army1.addSoldier(knight1);
        army1.addSoldier(knight2);
        army1.addSoldier(knight3);

        army1.printSoldiers();
        army1.printAttack();
        army1.printDefend();
        army1.printFuryAttack();
        army1.printFireDefend();
        army1.printFlanking();

        Army army2 = new Army("Chinese");
        Berserk berserk2 = new Berserk("Chinese Berserk");
        Archer archer4 = new Archer("Chinese Archer");
        Knight knight4 = new Knight("Chinese Knight");
        army2.addSoldier(berserk2);
        army2.addSoldier(archer4);
        army2.addSoldier(knight4);
        army2.printSoldiers();
        army1.killSoldier(army2, berserk1, knight4);
        army2.killSoldier(army1, archer4, knight1);
        army1.printSoldiers();
        army2.printSoldiers();
    }
}

