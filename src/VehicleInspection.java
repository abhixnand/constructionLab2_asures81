public class VehicleInspection implements IVehicleInspector {
    public float visit(Car car) { return 100; }
    public float visit(Van van) { return 200; }
    public float visit(Motorbike bike) { return 50; }
}
