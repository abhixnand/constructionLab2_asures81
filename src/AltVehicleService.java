import java.util.*;

public class AltVehicleService {
    private IVehicleInspector inspector;

    public AltVehicleService(String prop) {
        this.inspector = VehicleFactory.getVehicleInspector(prop);
    }

    public float calculateTotal(List<IVehicle> vehicles) {
        float total = 0;
        for (IVehicle v : vehicles) {
            total += v.accept(inspector);
        }
        return total;
    }
}
