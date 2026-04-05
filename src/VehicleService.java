import java.util.*;

public class VehicleService {
    private IVehicleInspector inspector = new VehicleInspection();

    public float calculateTotal(List<IVehicle> vehicles) {
        float total = 0;
        for (IVehicle v : vehicles) {
            total += v.accept(inspector);
        }
        return total;
    }
}
