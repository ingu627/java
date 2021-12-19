public class HouseDog extends Dog{
    public void sleep() {
        System.out.println(this.name+" zzz in house");
    }
    public static void main(String[] args) {
        HouseDog houseDog = new HouseDog();
        houseDog.setName("happy");
        houseDog.sleep(); //happy zzz in house
    }
}
