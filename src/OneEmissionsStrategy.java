public class OneEmissionsStrategy implements IEmissionsStrategy {
    public int computeEmissionsFee(IVehicle v) {
        return Math.min((int)(v.co2Emissions() - 1000), 0);
    }
}
