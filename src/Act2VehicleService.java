import java.util.*;

public class Act2VehicleService {
    private static Act2VehicleService instance;
    private IVehicleInspector inspector;

    private Act2VehicleService(IVehicleInspector inspector) {
        this.inspector = inspector;
    }

    static {
        String prop = System.getProperty("vi");
        IVehicleInspector inspector;

        if ("alt".equals(prop)) inspector = new AltVehicleInspection();
        else inspector = new VehicleInspection();

        instance = new Act2VehicleService(inspector);
    }

    public static Act2VehicleService getInstance() {
        return instance;
    }

    public float calculateTotal(List<IVehicle> vehicles) {
        float total = 0;
        for (IVehicle v : vehicles) {
            total += v.accept(inspector);
        }
        return total;
    }
}
