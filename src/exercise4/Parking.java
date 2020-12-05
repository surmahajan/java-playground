package exercise4;

public class Parking {

	private int Id;
	
	// Parking capacity
	private int capacity;
	
	// Exit Gate
	private int exitGate;
	
	// Entry Gate
	private int entryGate;
	
	// A1, A2, A3 ---- B1, B2, B3
	private String carParkingId;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getExitGate() {
		return exitGate;
	}

	public void setExitGate(int exitGate) {
		this.exitGate = exitGate;
	}

	public int getEntryGate() {
		return entryGate;
	}

	public void setEntryGate(int entryGate) {
		this.entryGate = entryGate;
	}

	public String getCarParkingId() {
		return carParkingId;
	}

	public void setCarParkingId(String carParkingId) {
		this.carParkingId = carParkingId;
	}
	
	
}
