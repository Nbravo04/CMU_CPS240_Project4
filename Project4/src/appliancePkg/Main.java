/*
 * Name:					Class: CPS 240
 * Assignment: 4			Date: 4 Oct 2018
 * 
 * Purpose: Demonstration of knowledge of factory method.
 * 
 */
package appliancePkg;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// ArrayList of appliance objects
		ArrayList<Appliance> applianceList = new ArrayList<Appliance>();

		// factory magic
		ApplianceFactory af = new ApplianceFactory();

		// populate ArrayList
		applianceList.add( af.buildAppliance("refrigerator") );
		applianceList.add( af.buildAppliance("coffeemaker") );
		applianceList.add( af.buildAppliance("stove") );
		applianceList.add( af.buildAppliance("microwave") );
		applianceList.add( af.buildAppliance("washer") );

		// print object informationn
		for(Appliance a : applianceList)
			System.out.println(a + "; " + a.getTax());

	}

}
