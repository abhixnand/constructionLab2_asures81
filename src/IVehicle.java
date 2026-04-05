public interface IVehicle {
    float accept(IVehicleInspector inspector);
    float co2Emissions();
}
