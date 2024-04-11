public class Vehicle {
    private int vehicleNo;
    private VehicleType vehicleType;
    private ParkingSpot parkingSpot;

    public Vehicle(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getVehicleNo () {
        return this.vehicleNo;
    }

    public void setVehicleNo(int vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public VehicleType getVehicleType() {
        return this.vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public ParkingSpot getParkingSpot() {
        return this.parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }


}
