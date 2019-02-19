package appliancePkg;

public class CoffeeMaker extends Appliance {

	public CoffeeMaker() {
		this.applianceName = "Coffee Maker";
		this.cost = 75.50;
	}

	@Override
	public String toString() {
		return String.format("%s, Cost: %.2f", applianceName, cost);
	}

}
