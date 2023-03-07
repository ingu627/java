public class CallByReference {
    public static void main(String[] args) {
        Animal ref_a = new Animal();
        Animal ref_b = ref_a;

        ref_a.age = 10;
        ref_b.age = 20;

        System.out.println(ref_a.age);
        System.out.println(ref_b.age);
    }
}
