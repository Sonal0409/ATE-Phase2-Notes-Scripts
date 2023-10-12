package com.app.TDD.demo;

import java.util.HashMap;
import java.util.Map;

public class PopulationSearch {

	private Map<String, Integer> getpopulationdata() {
		
		Map<String, Integer> populationMap = new HashMap<>();
		populationMap.put("Banglore", 1000000);
		populationMap.put("NewDelhi", 25000000);
		populationMap.put("Mumbai", 2000000);
		populationMap.put("Pune", 500000);
		

		return populationMap;
	}
	
	public int getPopulation(String city) {
		
		Map<String, Integer> populationMap = null ;
		int count =0;
		
		if(city.isEmpty())
		{
			throw new NullPointerException("City name cannot be empty");
		}
		populationMap = getpopulationdata();
		
		if(!populationMap.containsKey(city))
		{
			throw new NullPointerException("City name doesnot exist");
		}
		else {
		count = populationMap.get(city);
		}
		return count;
		
	}

}
