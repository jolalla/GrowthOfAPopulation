package Pruebas;

//Juan Olalla Galán

public class GrowthOfAPopulation {

	public static int nbYear(int p0, double percent, int aug, int p) {
		// initialization of years, populationRefresh(it will be udpated at each step of
		// the loop, and converting percentage to a double
		int years = 0;
		double populationRefresh = p0;
		double percentage = percent / 100;
		// The while loop will take the population update untill it will reach the value
		// to surpass
		while (populationRefresh < p) {// Applying the formula
			populationRefresh = populationRefresh + (populationRefresh * percentage) + aug;
			// Counting each year at each step of this loop
			years++;
		}
		// returning years
		return (int) years;
	}



}
