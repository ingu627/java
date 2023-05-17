import java.util.Optional;

public class Passport1 {

    private Optional<Stamp1> stamp;

    public Passport1(Optional<Stamp1> stamp) {
        this.stamp = stamp;
    }

    public Optional<Stamp1> getStamp() {
        return stamp;
    }

    public void setStamp(Optional<Stamp1> stamp) {
        this.stamp = stamp;
    }
}
