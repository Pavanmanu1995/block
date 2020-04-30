package com.mindtree.cityblock.service.serviceimplementation;

import java.util.Comparator;

import com.mindtree.cityblock.entity.Block;

public class BlockComparator implements Comparator<Block> {

	@Override
	public int compare(Block o1, Block o2) {

		return o1.getBlockname().compareTo(o2.getBlockname());
	}

}
