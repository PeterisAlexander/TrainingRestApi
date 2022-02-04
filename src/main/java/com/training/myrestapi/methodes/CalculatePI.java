package com.training.myrestapi.methodes;

public class CalculatePI {
	public static Double calculingPi(int number, int scale) {
		
		double pi = 0;
		
		for (int i = 1; i <number; i++) {
			pi += Math.pow(-1,i+1) / (2*i - 1);
		} 
		
		return 4 * pi;
	}
	
	public static double roundAvoid(double value, int places) {
	    double scale = Math.pow(10, places);
	    return Math.round(value * scale) / scale;
	}
}
