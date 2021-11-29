package by.bsuir.lab2.main;

import java.util.List;

import by.bsuir.lab2.entity.Appliance;

public class PrintApplianceInfo {

	public static void print(List<Appliance> appliance) {
		System.out.println();
		for(int i=0; i < appliance.size();i++)
			System.out.println(appliance.get(i).toString());
		System.out.println();
		// you may add your own code here
	}

	// you may add your own code here

}
