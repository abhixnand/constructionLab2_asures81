import java.util.*;

public class Act3VehicleService {
    private static Act3VehicleService instance;
    private IVehicleInspector inspector;
    private IEmissionsStrategy strategy;

    private Act3VehicleService(IVehicleInspector i, IEmissionsStrategy s) {
        this.inspector = i;
        this.strategy = s;
    }

    static {
        String vi = System.getProperty("vi");
        String es = System.getProperty("es");

        IVehicleInspector inspector;
        if ("alt".equals(vi)) inspector = new AltVehicleInspection();
        else inspector = new VehicleInspection();

        IEmissionsStrategy strategy;
        if ("one".equals(es)) strategy = new OneEmissionsStrategy();
        else if ("two".equals(es)) strategy = new TwoEmissionsStrategy();
        else strategy = new NullEmissionsStrategy();

        instance = new Act3VehicleService(inspector, strategy);
    }

    public static Act3VehicleService getInstance() {
        return instance;
    }

    public float calculateTotal(List<IVehicle> vehicles) {
        float total = 0;
        for (IVehicle v : vehicles) {
            total += strategy.computeEmissionsFee(v) + v.accept(inspector);
        }
        return total;
    }
}
