package appliancePkg;

public class ApplianceFactory {

	/*
	 * This method returns the appropriate appliance based off of the
	 * applianceName argument. Prompts an error message and returns
	 * null when invalid argument value is passed.
	 */
	public Appliance buildAppliance( String applianceName ) {
		switch(applianceName.toLowerCase()) {
		case "refrigerator":
			return new Refrigerator();
		case "coffeemaker":
			return new CoffeeMaker();
		case "washer":
			return new Washer();
		case "microwave":
			return new Microwave();
		case "stove":
			return new Stove();
		default:
			System.err.println("Unrecognized appliance name.");
			return null;
		}
	}
}
