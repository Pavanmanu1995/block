package com.mindtree.cityblock.service.serviceimplementation;

import java.util.Comparator;

import com.mindtree.cityblock.entity.City;

public class CityComparator implements Comparator<City> {

	@Override
	public int compare(City c1, City c2) {
		return c1.getCityname().compareTo(c2.getCityname());
	}

}
