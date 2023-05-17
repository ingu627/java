public class App {

    enum Season {
        SPRING,SUMMER,AUTUMN,WINTER
    }

    public static void main(String[] args) {
//        System.out.println(Day.FRIDAY);
//
//        Day monday = Day.MONDAY;
//
//        System.out.println(monday);
//        System.out.println();
//
//        for(Day d : Day.values())
//            System.out.println(d);

//        System.out.println(Season.SPRING);
//
//        for(Season s : Season.values())
//            System.out.println(s);

        seasonMethod(Season.AUTUMN);

    }

    public static void seasonMethod(Season season) {

        switch(season) {

            case SPRING:
                System.out.println("This is spring...");
                break;
            case AUTUMN:
                System.out.println("This is autumn...");
                break;
            case WINTER:
                System.out.println("This is winter...");
                break;
            case SUMMER:
                System.out.println("This is summer...");
                break;

            default:
                System.out.println("Not sure about the season...");
                break;
        }

    }

}
