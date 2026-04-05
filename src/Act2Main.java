import java.util.*;

public class Act2Main {
    public static void main(String[] args) {
        Act2VehicleService service = Act2VehicleService.getInstance();

        List<IVehicle> vehicles = Arrays.asList(
            new Car(2015),
            new Van(4),
            new Motorbike(80)
        );

        System.out.println(service.calculateTotal(vehicles));
    }
}
