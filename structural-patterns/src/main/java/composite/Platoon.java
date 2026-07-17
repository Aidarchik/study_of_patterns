package composite;

import java.util.ArrayList;
import java.util.List;

public class Platoon implements MilitaryComponent {
    private final List<MilitaryComponent> components = new ArrayList<>();

    @Override
    public void add(MilitaryComponent component) {
        this.components.add(component);
    }

    @Override
    public int getCost() {
        int total = 0;
        for (MilitaryComponent component : components) {
            total += component.getCost();
        }
        return total;
    }
}
