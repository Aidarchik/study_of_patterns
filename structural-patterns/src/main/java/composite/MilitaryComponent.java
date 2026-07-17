package composite;

public interface MilitaryComponent {
    void add(MilitaryComponent component);

    int getCost();
}
