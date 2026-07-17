package composite;

public class Soldier implements MilitaryComponent {
    private final int cost;

    public Soldier(int cost) {
        this.cost = cost;
    }

    @Override
    public void add(MilitaryComponent component) {

    }

    @Override
    public int getCost() {
        return this.cost;
    }
}
