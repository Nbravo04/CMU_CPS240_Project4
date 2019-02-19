package appliancePkg;

public class Refrigerator extends Appliance {

	public Refrigerator() {
		this.applianceName = "Refrigerator";
		this.cost = 850.5;
	}

	@Override
	public String toString() {
		return String.format("%s, Cost: %.2f", applianceName, cost );
	}

}
