package by.bsuir.lab2.service.impl;

import java.util.List;

import by.bsuir.lab2.dao.ApplianceDAO;
import by.bsuir.lab2.dao.DAOFactory;
import by.bsuir.lab2.entity.Appliance;
import by.bsuir.lab2.entity.criteria.Criteria;
import by.bsuir.lab2.service.ApplianceService;
import by.bsuir.lab2.service.validation.Validator;

public class ApplianceServiceImpl implements ApplianceService {

	// @Override
	public List<Appliance> find(Criteria criteria) {

		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();

		List appliance = applianceDAO.find(criteria);

		// you may add your own code here

		return appliance;
	}

}

// you may add your own new classes
