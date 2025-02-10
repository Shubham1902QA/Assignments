package com.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AssignmentOnArrCollectionsAss5 {

	public static void main(String[] args) {
		//Adding top 5 populated countries in the world into a list
		List<String> Countries= new ArrayList<String>();
		Countries.add("India");
		Countries.add("China");
		Countries.add("United States");
		Countries.add("Indonesia");
		Countries.add("Russia");
		//Printing the 2nd populated country value of the list
		System.out.println("The 2nd most populated country is ="+Countries.get(1));
		
		//Creating a set of the most visited places in the world
		Set<String> VistedCountries= new HashSet<String>();
		VistedCountries.add("France");
		VistedCountries.add("Thailand");
		VistedCountries.add("Turkey");
		VistedCountries.add("United Kingdom");
		VistedCountries.add("Germany");
		VistedCountries.add("Mexico");
		VistedCountries.add("Spain");
		VistedCountries.add("Austria");
		VistedCountries.add("NewYork");
		VistedCountries.add("Hongkong");
		//Printing the entire set
		System.out.println("The top 10 most visited places in the world ="+"\n" +VistedCountries);
		//Printing the size of the set
		System.out.println("The size of the set is ="+"\n" +VistedCountries.size());
		
		//Map of the 5 largest cities in the United States and their populations.
		
		Map<String,Integer> LargestCities= new HashMap<String,Integer>();
		
		LargestCities.put("New York", 8335897);
		LargestCities.put("California", 3822238);
		LargestCities.put("Illinois", 2665039);
		LargestCities.put("Texas", 2302878);
		LargestCities.put("Arizona", 1644409);
//		Printing the entire map class with key value pair
		System.out.println("The list of top 5 most populated cities are = "+"\n"+LargestCities);
		
//		Creating an array of 10 random integers and print out the sum of 3rd and 5th Value.
	int randomIntegrs[] = {101, 102, 103, 203, 204, 301, 303, 306, 122, 401, 410};
	int sum=0;
	sum =randomIntegrs[2]+randomIntegrs[4];
//	printing the arraylist 
	System.out.println("The sum of random integers is = "+sum);
//	Create a list of the top 5 highest-grossing movies of all time and print out the third movie
//	on the list.
	List<String> HighestgrossMovies= new  ArrayList<String>();
	HighestgrossMovies.add("Bahubali");
	HighestgrossMovies.add("Sultan");
	HighestgrossMovies.add("KGF");
	HighestgrossMovies.add("Salaar");
	HighestgrossMovies.add("Fighter");
	System.out.println("The 3rd highest gross movies = "+HighestgrossMovies.get(2));
		

	}

}
