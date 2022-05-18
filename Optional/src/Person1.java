import java.util.Optional;

public class Person1 {

    private String name;
    private Optional<Passport1> passport;

    public Person1(String name, Optional<Passport1> passport) {
        this.name = name;
        this.passport = passport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<Passport1> getPassport() {
        return passport;
    }

    public void setPassport(Optional<Passport1> passport) {
        this.passport = passport;
    }
}
