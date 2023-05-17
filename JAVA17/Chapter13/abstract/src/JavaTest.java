public class JavaTest {
    public static void main(String[] args) {
        Unit[] arUnit = {
                new Marine(),
                new Zealot(),
                new Mutal(),
                new SuperMan(),
                new Firebat()
        };

        for (Unit u : arUnit) {
            u.move();
            u.attack();
        }
        System.out.println();

        DarkTempler dt = new DarkTempler();
        dt.hide();

        Medic medic = new Medic();
        medic.heal();
    }
}
