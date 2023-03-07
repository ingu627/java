public class Penguin extends Animal {
    public String habitat;

    public void showHabitat() {
        System.out.printf("%s는 %s에 살아\n", name, habitat);
    }

    // overriding
    public void showName() {
        System.out.println("어머 내 이름은 알아서 뭐하게요?");
    }

    public void showName(String yourName) {
        System.out.printf("%s 안녕, 나는 %s라고 해\n", yourName, name);
    }
}
