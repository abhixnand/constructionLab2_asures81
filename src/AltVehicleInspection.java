public class AltVehicleInspection implements IVehicleInspector {
    public float visit(Car car) { return 150; }
    public float visit(Van van) { return 250; }
    public float visit(Motorbike bike) { return 100; }
}
