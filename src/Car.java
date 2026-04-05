public class Car implements IVehicle {
    private int manufactureDate;

    public Car(int manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public int getManufactureDate() { return manufactureDate; }

    @Override
    public float accept(IVehicleInspector inspector) {
        return inspector.visit(this);
    }

    @Override
    public float co2Emissions() {
        return (float)(8887 * (1 + (0.05 * (2020 - manufactureDate))));
    }
}
