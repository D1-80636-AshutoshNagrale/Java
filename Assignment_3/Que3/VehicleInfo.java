package Assignment_3.Que3;

public class VehicleInfo {
	private double milesPerDay;
	private double costOfGasoline;
	private double averagePerGallon;
	private double parkingFeesPerDay;
	private double tollPerDay;

	public VehicleInfo(double milesPerDay, double costOfGasoline, double averagePerGallon, double parkingFeesPerDay,
			double tollPerDay) {
		super();
		this.milesPerDay = milesPerDay;
		this.costOfGasoline = costOfGasoline;
		this.averagePerGallon = averagePerGallon;
		this.parkingFeesPerDay = parkingFeesPerDay;
		this.tollPerDay = tollPerDay;
	}

	public void displayInfo() {
		System.out.println("Total iles driven per day : " + this.milesPerDay);
		System.out.println("Cost per gallon of gasoline" + this.costOfGasoline);
		System.out.println("Average miles per gallon : " + this.averagePerGallon);
		System.out.println("Parking fees per day : " + this.parkingFeesPerDay);
		System.out.println("Tolls per day : " + this.parkingFeesPerDay);
		System.out.println("***************************************");
		System.out.println("Total cost per day : "
				+ ((this.milesPerDay * (this.costOfGasoline/10) * (this.averagePerGallon / 10))
						+ this.parkingFeesPerDay + this.tollPerDay));
	}

	public static void main(String[] args) {
		VehicleInfo info = new VehicleInfo(45, 1100, 180, 200, 300);
		info.displayInfo();
	}
}
