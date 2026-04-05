import java.util.*;

public class Main {
    public static void main(String[] args) {
        VehicleService service = new VehicleService();

        List<IVehicle> vehicles = Arrays.asList(
            new Car(2015),
            new Van(4),
            new Motorbike(80)
        );

        System.out.println(service.calculateTotal(vehicles));
    }
}
