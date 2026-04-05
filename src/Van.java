public class Van implements IVehicle {
    private int numberOfDoors;

    public Van(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() { return numberOfDoors; }

    @Override
    public float accept(IVehicleInspector inspector) {
        return inspector.visit(this);
    }

    @Override
    public float co2Emissions() {
        return (float)(8887 * (1 + (0.1 * (numberOfDoors - 2))));
    }
}
