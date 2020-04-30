package com.mindtree.cityblock.service;

import java.util.Map;
import java.util.Set;

import com.mindtree.cityblock.entity.Block;
import com.mindtree.cityblock.entity.City;

public interface CityBlockService {

	Map<City, Set<Block>> sortMapData(Map<City, Set<Block>> cityblocks);



}
