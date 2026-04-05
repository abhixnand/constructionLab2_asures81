public class TwoEmissionsStrategy implements IEmissionsStrategy {
    public int computeEmissionsFee(IVehicle v) {
        return Math.min((int)(v.co2Emissions() - 1100), 10);
    }
}
