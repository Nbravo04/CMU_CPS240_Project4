package appliancePkg;

public class Washer extends Appliance{

	public Washer() {
		this.applianceName = "Washer";
		this.cost = 599.99;
	}

	@Override
	public String toString() {
		return String.format("%s, Cost: %.2f", applianceName, cost);
	}
}
