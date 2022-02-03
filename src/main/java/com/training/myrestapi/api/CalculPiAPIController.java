package com.training.myrestapi.api;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/calculPi")
public class CalculPiAPIController {
	@SuppressWarnings("deprecation")
	@GetMapping(value = "", produces = "application/json")
	public BigDecimal calculPiToCirconferenceCircle(
			@RequestParam("diametre") float diametre,
			@RequestParam("rayon") float rayon,
			@RequestParam("indice") float indice
			) {
		
		double circonference = Math.PI * diametre;
		double pi = diametre / circonference;
		
		BigDecimal result = (new BigDecimal(pi)).setScale(2, BigDecimal.ROUND_CEILING);
				
		return result;
	}
}
