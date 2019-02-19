package appliancePkg;

/*
 * Abstract class, used as a template for all of the appliances
 */
public abstract class Appliance {

	String applianceName;
	int id;
	double cost;

	// returns a string describing the tax amount for the appliance
	public String getTax() {
		return String.format("Cost of %s is $%.2f after tax.", applianceName, cost*1.06);
	}
}

