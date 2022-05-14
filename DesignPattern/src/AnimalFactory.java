public class AnimalFactory {

    public static Animal getAnimal(String species) {

        if(species.equals("TIGER")) {
            return new Tiger();
        } else if (species.equals("ELEPHANT")) {
            return new Elephant();
        } else if (species.equals("TURTLE")) {
            return new Turtle();
        }

        return null;
    }
}
