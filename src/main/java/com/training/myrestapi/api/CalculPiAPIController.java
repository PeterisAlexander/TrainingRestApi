package com.training.myrestapi.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/calculPi")
public class CalculPiAPIController {

	@GetMapping(value = "", produces = "application/json")
	public double calculPiToCirconferenceCircle(
			@RequestParam("diametre") float diametre,
			@RequestParam("rayon") float rayon,
			@RequestParam("indice") int indice
			) {
		
		double circonference = Math.PI * diametre;
		double pi = diametre / circonference;
		
		return roundAvoid(pi,indice);
	}
	
	public static double roundAvoid(double value, int places) {
	    double scale = Math.pow(10, places);
	    return Math.round(value * scale) / scale;
	}
}
