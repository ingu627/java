import javax.swing.text.html.Option;
import java.util.Optional;

public class App1 {
    public static void main(String[] args) {

//        Optional<Stamp1> stamp = Optional.ofNullable(new Stamp1("Barbados"));
        Optional<Stamp1> stamp = Optional.ofNullable(null);

        Optional<Passport1> passport = Optional.ofNullable(new Passport1(stamp));

        Optional<Person1> person = Optional.ofNullable(new Person1("Kevin", passport));

//        System.out.println(person.getName()+"-"+person.getPassport().getStamp().getStampOfCountry());

        // Using optional

        // map : if a value is present, applies the provided mapping function to it, and if the result is
        // non-null, returns an Optional describing the result.
        // flatMap : if a value is present, it applies the provided Optional-bearing mapping function
        // to it, returns that result, otherwise returns an empty Optional. Its purpose is to apply the
        // transformation function on the value of an Optional (just like the map operation does)
        // but then flatten the resulting multi-level Optional into a single one.

        String stampOfCountry = person.flatMap(Person1::getPassport).flatMap(Passport1::getStamp).map(Stamp1::getStampOfCountry).orElse("Unknown");
        System.out.println(stampOfCountry);






    }
}
