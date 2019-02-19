package appliancePkg;

public class Microwave extends Appliance{

	public Microwave() {
		this.applianceName = "Microwave";
		this.cost = 299.99;
	}

	@Override
	public String toString() {
		return String.format("%s, Cost: %.2f", applianceName, cost);
	}
}
