public class Util {
    static void outName(Human.Name name) {
        System.out.println(name.family + name.first + "입니다");
    }

    static void outHuman(Human who) {
        who.intro();
    }
}
