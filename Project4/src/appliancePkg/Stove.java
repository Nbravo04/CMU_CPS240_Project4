package appliancePkg;

public class Stove extends Appliance{

	public Stove() {
		this.applianceName = "Stove";
		this.cost = 1399.99;
	}

	@Override
	public String toString() {
		return String.format("%s, Cost: %.2f", applianceName, cost);
	}
}
