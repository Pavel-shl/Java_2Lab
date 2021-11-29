package by.bsuir.lab2.main;

import static by.bsuir.lab2.entity.criteria.SearchCriteria.*;

import by.bsuir.lab2.entity.Appliance;
import by.bsuir.lab2.entity.criteria.Criteria;
import by.bsuir.lab2.service.ApplianceService;
import by.bsuir.lab2.service.ServiceFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Appliance> appliance = new ArrayList<Appliance>();

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria criteriaTeapot = new Criteria(Teapot.class.getSimpleName());// "Teapot"
		//appliance.add(Teapot.CAPACITY.toString(), 3);
		
		appliance = service.find(criteriaTeapot);
		
		System.out.println("All Teacup");
		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////
		
		criteriaTeapot = new Criteria("none");
		criteriaTeapot.add(Teapot.COST.toString(), 0);
		
		System.out.println("The cheepest thing:");
		appliance = service.find(criteriaTeapot);

		PrintApplianceInfo.print(appliance);


	}

}
