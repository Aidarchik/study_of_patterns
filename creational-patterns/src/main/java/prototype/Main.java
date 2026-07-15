package prototype;

public class Main {

    public static void main(String[] args) {

        RobotProt alpha = new RobotProt("T-800", "Laser");

        RobotProt beta = (RobotProt) alpha.clone();

        System.out.println("Робот Альфа оружие: " + alpha.getWeapon());
        System.out.println("Робот Бета оружие: " + beta.getWeapon());
    }
}
