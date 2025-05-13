package Army.soldier;


public abstract class Soldier {
    private String name;

    public Soldier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void printInfo();
}
