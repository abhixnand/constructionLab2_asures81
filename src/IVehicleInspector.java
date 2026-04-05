public interface IVehicleInspector {
    float visit(Car car);
    float visit(Van van);
    float visit(Motorbike bike);
}
