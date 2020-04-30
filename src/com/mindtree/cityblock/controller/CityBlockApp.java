package com.mindtree.cityblock.controller;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import com.mindtree.cityblock.entity.Block;
import com.mindtree.cityblock.entity.City;
import com.mindtree.cityblock.service.CityBlockService;
import com.mindtree.cityblock.service.serviceimplementation.CityBlockServiceImplementation;

public class CityBlockApp {
	static Scanner sc = new Scanner(System.in);
	static Map<City, Set<Block>> cityblocks = new TreeMap<City, Set<Block>>();
	static CityBlockService cityBlockService = new CityBlockServiceImplementation();

	public static void main(String[] args) {

		boolean flag = true;
		do {

			System.out.println("enter 1 to add city and block ");
			System.out.println("enter 2 to display all");
			System.out.println("enter option");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				System.out.println("entre how many cities you want to enter");
				int citynumber = sc.nextInt();

				for (int i = 0; i < citynumber; i++) {
					System.out.println("enter city id");
					int cityid = sc.nextInt();
					System.out.println("entre city name");
					String cityname = sc.next();
					City city = new City(cityid, cityname);
					System.out.println("enter how many blocks that you want to enter in the city");
					int blocknumber = sc.nextInt();
					Set<Block> blocks = new HashSet<Block>();
					for (int j = 0; j < blocknumber; j++) {
						System.out.println("enter block number");
						int blockid = sc.nextInt();
						System.out.println("enter block name");
						String blockname = sc.next();
						Block block = new Block(blockid, blockname);

						blocks.add(block);

					}

					cityblocks.put(city, blocks);

				}
				break;
			case 2:

				Map<City, Set<Block>> map = cityBlockService.sortMapData(cityblocks);
				Iterator<Map.Entry<City, Set<Block>>> blockcity = map.entrySet().iterator();
				while (blockcity.hasNext()) {
					Map.Entry<City, Set<Block>> entry = blockcity.next();

					System.out.println("city" + entry.getKey() + "value" + entry.getValue());
				}

				break;

			}

		} while (flag);
	}
}
