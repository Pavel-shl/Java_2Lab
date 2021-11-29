package by.bsuir.lab2.dao;

import java.util.List;

import by.bsuir.lab2.entity.Appliance;
import by.bsuir.lab2.entity.criteria.Criteria;

public interface ApplianceDAO {
	List<Appliance> find(Criteria criteria);
}
