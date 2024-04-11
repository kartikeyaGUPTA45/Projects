public class App {
    public static void main(String[] args) throws Exception {
        ParkingLot parkingLot = new ParkingLot(1, 2, 3);

        Vehicle vehicle1 = new Vehicle(VehicleType.TRUCK);
        parkingLot.parkTheVehicle(vehicle1);

        Vehicle vehicle2 = new Vehicle(VehicleType.TRUCK);
        parkingLot.parkTheVehicle(vehicle2);


        // Payment -> hours -> cash/ credit / UPI
        // Multi floor parking
        // Entry and exit gate -> ticket 
    }
}
