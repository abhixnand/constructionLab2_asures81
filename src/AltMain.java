import java.util.*;

public class AltMain {
    public static void main(String[] args) {
        String prop = System.getProperty("vi");
        AltVehicleService service = new AltVehicleService(prop);

        List<IVehicle> vehicles = Arrays.asList(
            new Car(2015),
            new Van(4),
            new Motorbike(80)
        );

        System.out.println(service.calculateTotal(vehicles));
    }
}
