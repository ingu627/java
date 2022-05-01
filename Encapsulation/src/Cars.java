import java.util.ArrayList;
import java.util.List;

public class Cars {

    private List<String> cars;

    public List<String> getCars() {
//        return cars;
        return new ArrayList<>(this.cars);
    }

    public void setCars(List<String> cars) {
        this.cars = cars;
    }
}
