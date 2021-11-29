package by.bsuir.lab2.dao.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import by.bsuir.lab2.dao.ApplianceDAO;
import by.bsuir.lab2.entity.Appliance;
import by.bsuir.lab2.entity.*;
import by.bsuir.lab2.entity.Teapot;
import by.bsuir.lab2.entity.criteria.Criteria;

public class ApplianceDAOImpl implements ApplianceDAO {

	public static final String PATH_TO_DB = "src\\main\\resources\\appliances_db.xml";
	private List<Appliance> appliance;

	public ApplianceDAOImpl() {
		try {
			File file = new File(PATH_TO_DB);
			JAXBContext jaxbContext = JAXBContext.newInstance(Appliances.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Appliances que = (Appliances) jaxbUnmarshaller.unmarshal(file);
			appliance = que.getAppliances();
			System.out.println("All appliance");
			System.out.println("----------------------------------------------------------------------------------");
			for (Appliance app : appliance) {
				System.out.println(app);
			}
			System.out.println("----------------------------------------------------------------------------------");

		} catch (JAXBException e) {
			System.out.println(e.getMessage());
		}
	}

	// @Override
	public List<Appliance> find(Criteria criteria) {
		Appliance temp = new Appliance();
		List<Appliance> res = new ArrayList<Appliance>();
		int less = 0;
		
		for(int i = 0; i < appliance.size();i++)
		{
			temp = appliance.get(i);
			if(temp.GetName().equals(criteria.getGroupSearchName()) || criteria.getGroupSearchName() == "none")
			{
				if(criteria.getGroupSearchName() != "none")
					res.add(temp);
				if(criteria.getGroupSearchName() == "none" && i == 0)
				{
					res.add(findLess());
					return res;
				}
			}
			
		}
		return res;
	}

	private Appliance findLess() {
		Appliance temp = new Appliance();
		Appliance res = new Appliance();
		
		double less = appliance.get(0).getPrice();
		res = appliance.get(0);
		for(int i = 0; i < appliance.size();i++)
		{
			temp = appliance.get(i);
			if(less>temp.getPrice())
			{
				less = temp.getPrice();
				res = appliance.get(i);
			}
			
		}
		return res;
		
	}

}