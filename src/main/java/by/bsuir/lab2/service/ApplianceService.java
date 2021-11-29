package by.bsuir.lab2.service;

import java.util.List;

import by.bsuir.lab2.entity.Appliance;
import by.bsuir.lab2.entity.criteria.Criteria;

public interface ApplianceService {

	List<Appliance> find(Criteria criteria);

}
