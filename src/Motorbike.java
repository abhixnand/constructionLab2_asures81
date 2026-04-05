public class Motorbike implements IVehicle {
    private int engineCapacity;

    public Motorbike(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() { return engineCapacity; }

    @Override
    public float accept(IVehicleInspector inspector) {
        return inspector.visit(this);
    }

    @Override
    public float co2Emissions() {
        return (float)(8887 * (1 + (0.01 * (100 - engineCapacity))));
    }
}
