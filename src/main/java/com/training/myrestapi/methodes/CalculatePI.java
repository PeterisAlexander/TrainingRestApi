package com.training.myrestapi.methodes;

public class CalculatePI {
	
	/**
	 * 
	 * @param number
	 * @param scale
	 * @return double approximative pi
	 */
	public static Double calculingPi(int number, int scale) {
		
		double pi = 0;
		
		for (int i = 1; i <number; i++) {
			pi = Math.pow(-1,i+1) / (2*i - 1);
			pi++;
		} 
		
		return roundAvoid(4*pi , scale);
	}
	
	/**
	 * 
	 * @param value
	 * @param places
	 * @return double
	 */
	public static double roundAvoid(double value, int places) {
	    double scale = Math.pow(10, places);
	    return Math.round(value * scale) / scale;
	}
}
