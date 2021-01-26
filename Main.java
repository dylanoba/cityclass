import java.util.ArrayList;

public class Main {
	// Given a string that contains city names, return an arraylist that contains city objects with the approriate name. 
	// THis implies you need a City class. This class should provide for a way to specify the distance between any pair of cities. 
	// Do this by creating a 2 dimensional array of integers that represents the distance between a given pair of cites. 
	// We will need to map an index in the array to a given city! 
	// This means we will need a one dimensional array of Cities (that is grown whenever a new city is created) and we also will need each city to have a field that gives it's index into the two dimensional array.
	// Follow in lecture! Much of the above will be implemented or explained there. Your mission will be as much about writing the Engish description of the code as it will be about writing the code.

	public static void main(String[] args) {
		

		String stringOfCities1 = "San Francisco,Palo Alto,Mountain View"; // String that contains city names
		
		String stringOfCities2 = "San Francisco";
		
		String stringOfCities3 = "";
		

		ArrayList<City> alc1 = strToALC(stringOfCities1);
		ArrayList<City> alc2 = strToALC(stringOfCities2);
		ArrayList<City> alc3 = strToALC(stringOfCities3);
		

		System.out.println(alc1);
		System.out.println(alc2);
		System.out.println(alc3);
		
	}

	public static ArrayList<City> strToALC(String citiesAsString) {
		
		ArrayList<City> s = new ArrayList<City>();
		
		if (citiesAsString.equals("")) {
			return s;
		}
		
		int leftIndex = 0;
		int rightIndex = citiesAsString.indexOf(",");
		
		while (rightIndex >= 0) {
			City newCity = new City(citiesAsString.substring(leftIndex, rightIndex));
			s.add(newCity);
			leftIndex = rightIndex + 1;
			rightIndex = citiesAsString.indexOf(",", leftIndex);
		}
		City newCity = new City(citiesAsString.substring(leftIndex));
		s.add(newCity);
		return s;

	}

}
