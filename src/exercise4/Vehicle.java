package exercise4;

public class Vehicle {
	
	private int Id;
	
	private VehicleType vehicleType;
	
	private String vehicleNumber;
	

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	
}
