package com.mindtree.cityblock.service.serviceimplementation;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.mindtree.cityblock.entity.Block;
import com.mindtree.cityblock.entity.City;
import com.mindtree.cityblock.service.CityBlockService;

public class CityBlockServiceImplementation implements CityBlockService {

	@Override
	public Map<City, Set<Block>> sortMapData(Map<City, Set<Block>> cityblocks) {

		
		for (Map.Entry<City, Set<Block>> entry : cityblocks.entrySet()) {

			List<Block> blocks = new LinkedList<Block>(entry.getValue());

			Collections.sort(blocks, new Comparator<Block>() {

				@Override
				public int compare(Block o1, Block o2) {
					return o2.getBlockname().compareTo(o1.getBlockname());
				}
			});
			
			Set<Block> blocks2 = new LinkedHashSet<Block>(blocks);
			
		cityblocks.put(entry.getKey(), blocks2);

		}

		return cityblocks;
	}

}
