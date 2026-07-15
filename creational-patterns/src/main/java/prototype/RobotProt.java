package prototype;

public class RobotProt implements Cloneable {
    private final String s;
    private String weapon;

    public RobotProt(String s, String weapon) {
        this.s = s;
        this.weapon = weapon;
    }

    public String getWeapon() {
        return this.weapon;
    }

    @Override
    public RobotProt clone() {
        try {
            RobotProt clone = (RobotProt) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
