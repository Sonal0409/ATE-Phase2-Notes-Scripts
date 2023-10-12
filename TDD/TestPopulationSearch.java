package com.app.TDD.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPopulationSearch {
	
	// give a city name as test data , the code should return  the population in the city
	
	@Test
	public void findpopulation()
	{
		
		String city = "Mumbai";
		int ExpectedPopulation = 2000000;
		PopulationSearch ps = new PopulationSearch();
		
		// number of people in the city
		
		int count = ps.getPopulation(city);
		
		System.out.println(count);
		
		Assert.assertEquals(count, ExpectedPopulation);
		
	}
	
	@Test
	public void findpopulationEmptyInput()
	{
		try {
		String city = "";
		int ExpectedPopulation = 0;
		PopulationSearch ps = new PopulationSearch();
		
		// number of people in the city
		
		int count = ps.getPopulation(city);
		}
		
		catch(NullPointerException e)
		{
			System.out.println("City name cannot be empty");
		}
		
		
		
	}
	
	@Test
	public void findpopulationInvalidInput()
	{
		try {
		String city = "Hyderabad";
		int ExpectedPopulation = 700000;
		PopulationSearch ps = new PopulationSearch();
		
		// number of people in the city
		
		int count = ps.getPopulation(city);
		}
		
		
		catch(NullPointerException e1)
		{
			System.out.println("City name doesnot exisit in the list");
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
